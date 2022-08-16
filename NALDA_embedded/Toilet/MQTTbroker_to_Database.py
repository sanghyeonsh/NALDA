import paho.mqtt.client as mqtt # mqtt 라이브러리 
import mysql.connector as mariadb # db연결 라이브러리

NALDA_db = mariadb.connect(host="nalda-db.c2k2xt6qu8x0.ap-northeast-2.rds.amazonaws.com",user='NALDA_admin',password='Blueskin741^',database='NALDA_db') # NALDA_db와 연결
cur = NALDA_db.cursor() # cursor 지정
#global value
#global my_topic

# 브로커 접속 시도 결과 처리 콜백 함수
def on_connect(client, userdata, flags, rc):
    print("Connected with result code "+ str(rc))
    if rc == 0:
        client.subscribe("toilet/#") # 연결 성공시 토픽 구독 신청
    else:
        print('연결 실패 : ', rc)
 
# 관련 토픽 메시지 수신 콜백 함수
def on_message(client, userdata, msg):
    #global value
    #global my_topic
    value = int(msg.payload.decode()) # value에 payload 값을 int형으로 저장
    my_topic=msg.topic.split('/'); # topic의 /를 기준으로 split
    print(f" {my_topic} {value}") # topic값과 value값을 출력해서 확인
    #print(f"{my_topic[1]}")
    cur = NALDA_db.cursor(prepared=True) # cursor 지정
    #print("select toilet_id from toilet where airplane_id = (select airplane_id from airplane where airplane_kind = {kind}) and toilet_code={code};".format(kind=my_topic[1],code=my_topic[2]))
    cur.execute("select toilet_id from toilet where airplane_id = (select airplane_id from airplane where airplane_kind = '{kind}') and toilet_code='{code}';".format(kind=my_topic[1],code=my_topic[2])); #sql문 비행기 테이블의 비행기 아이디와, 비행기 기종이 일치하는 비행기와 화장실 코드가 일치하는 곳의 코드를 toilet 코드에서 가져와서 toilet_id를 사용한다.
    toilet_id = cur.fetchone()[0] # toilet_id가 tuple형식으로 출력되므로, 0번 인덱스만 가져온다.
    print(toilet_id)
    sql = "INSERT INTO toilet_log (used, toilet_id) VALUES (?,?);" # 해당 payload 값과 toilet_id값에 읽어온 값을 넣는다.
    val = (value,toilet_id) # value에 들어갈 값
    cur.execute(sql,val)
    NALDA_db.commit()
    print(cur.rowcount, "record inserted.") # 성공적으로 들어갈 경우 콘솔에 출력 

# 1. MQTT 클라이언트 객체 인스턴스화
client = mqtt.Client()
 
# 2. 관련 이벤트에 대한 콜백 함수 등록
client.on_connect = on_connect
client.on_message = on_message
 
try :
    # 3. 브로커 연결
    client.connect("192.168.35.242")
 
    # 4. 메시지 루프 - 이벤트 발생시 해당 콜백 함수 호출됨
    client.loop_forever()
    
    # client.loop_start()
    # 새로운 스래드를 가동해서 운영 - daemon 스레드  Thread.setDaemon(True)

except Exception as err:
    print('에러 : %s'%err)
 
print("--- End Main Thread ---")