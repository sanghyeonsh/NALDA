# DB

# 테이블 리스트

| 테이블 명           | 설명                                                      |
| ------------------- | --------------------------------------------------------- |
| user                | 회원의 기본 정보를 담은 테이블                            |
| user_detail         | 회원의 정보 중 세관신고서에만 필요한 정보를 담은 테이블   |
| customs_declaration | 세관신고서에 필요한 정보 중 개인 정보 제외(2단계 + 3단계) |
| visited_country     | 회원이 최근 방문한 국가                                   |
| orders              | 승무원에게 하는 모든 요청을 관리하는 테이블               |
| orders_codes        | 각각의 요청을 코드로 관리하는 테이블                      |
| flight              | 비행 정보를 관리하는 테이블                               |
| airplane            | 비행기의 정보를 관리하는 테이블                           |
| toilet              | 화장실의 위치에 대한 정보를 관리하는 테이블               |
| seat                | 좌석 정보와 등급을 관리하는 테이블                        |
| seat_meal           | 각 좌석에서 시킨 기내식을 관리하는 테이블                 |
| meal                | 기내식의 기본 정보를 관리하는 테이블                      |
| meal_stock          | 기내식의 개수를 관리하는 테이블                           |
| meal_detail         | 기내식의 세부 항목을 관리하는 테이블                      |
| allergy             | 알레르기 정보를 관리하는 테이블                           |
| snack               | 간식 정보를 관리하는 테이블                               |
| snack_stock         | 간식의 개수를 관리하는 테이블                             |
| amenity             | 편의 물품 정보를 관리하는 테이블                          |
| amenity_stock       | 편의 물품 개수를 관리하는 테이블                          |
| medical             | 증상 정보를 관리하는 테이블                               |

# 주요 테이블과 주요 컬럼

## orders

- order_time
  - 주문이 들어온 시간으로 시간으로 정렬하여 승무원에게 리스트를 띄워주기 위한 컬럼
- order_message
  - 의료에서 기타를 선택한 경우 메시지로 들어올 수 있도록 하기 위한 컬럼
  - 나머지 경우에는 null값

## flight

- flight_date
  - 출발한 날짜와 시간을 기록하는 컬럼
  - 시간에 따른 기내식 배정에 사용될 것으로 예상
- 운행시간이 필요해 보임(7/18)

## airplane

- passenger_num
  - 비행기에 따른 승객의 수인데 flight에 들어가야 한다고 생각 논의해보기(7/18)
- airplain_kind
  - 비행기의 기종으로 기종에 따른 좌석배치도를 위한 컬럼
  - tmi : 기존에 비행기의 기종에 따른 기내식을 생각했으나 관리자가 기내식을 관리하기로 함

## toilet

- toilet_code
  - Head, Middle, Tail의 앞 글자를 따서 H01, M02와 같은 코드로 관리
  - 앞글자의 개수에 따라 화장실 이용 여부 확인 가능(H가 2개이면 Head에 화장실이 2개 있는 비행기)

## seat

- seat_num
  - 좌석 번호에 대한 컬럼으로 이 컬럼을 통해 모든 요청이 이뤄지며, 승무원은 이 번호를 확인하여 서비스를 제공함
- seat_class
  - 좌석 등급에 대한 컬럼으로 화장실, 기내식 등에서 등급에 따른 구분을 해줌

## seat_meal

- meal_classification
  - 어떤 기내식을 선택했는지에 대한 컬럼으로 승무원이 확인하고 각 좌석에 나눠줌

## meal

- meal_country
  - 예시) 한식, 일식, 양식
- meal_menu
  - 예시) 치킨 스테이크, 낙지 덮밥
- image_name
  - 이미지를 띄울 때 사용하는 컬럼

## meal_stock

- total
  - 각 기내식의 총 개수
  - 이륙 전에 승무원이 입력해줄 것

## meal_detail

- meal_name
  - 세부 음식에 대한 컬럼

## snack

- service_code
  - 서비스 코드를 통해 어떤 타입인지를 분류하고 관리함
- image_name
  - 이미지를 띄울 때 사용하는 컬럼
- classification
  - 필요한가??

## snack_stock

- total
  - 각 간식류의 총 개수
  - 이륙 전에 승무원이 입력해줄 것

## amenity

- service_code
  - 서비스 코드를 통해 어떤 타입인지를 분류하고 관리함

## amenity_stock

- total
  - 각 편의 물품의 총 개수
  - 이륙 전에 승무원이 입력해줄 것

## medical

- service_code
  - 서비스 코드를 통해 어떤 타입인지를 분류하고 관리함
- medical_name
  - 증상의 이름을 관리할 컬럼
