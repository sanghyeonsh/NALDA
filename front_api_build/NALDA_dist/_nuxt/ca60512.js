(window.webpackJsonp=window.webpackJsonp||[]).push([[66],{1083:function(t,e,r){"use strict";r.r(e);r(5),r(4),r(2),r(1),r(6),r(3),r(7);var d=r(0),n=r(120);function c(object,t){var e=Object.keys(object);if(Object.getOwnPropertySymbols){var r=Object.getOwnPropertySymbols(object);t&&(r=r.filter((function(t){return Object.getOwnPropertyDescriptor(object,t).enumerable}))),e.push.apply(e,r)}return e}function o(t){for(var i=1;i<arguments.length;i++){var source=null!=arguments[i]?arguments[i]:{};i%2?c(Object(source),!0).forEach((function(e){Object(d.a)(t,e,source[e])})):Object.getOwnPropertyDescriptors?Object.defineProperties(t,Object.getOwnPropertyDescriptors(source)):c(Object(source)).forEach((function(e){Object.defineProperty(t,e,Object.getOwnPropertyDescriptor(source,e))}))}return t}var h={name:"OrdersMedical",components:{},computed:o({},Object(n.e)("user",["loginMember","seatInfo","flightNum"])),methods:o(o({},Object(n.b)("menu",["postOrders"])),{},{headache:function(){var t={orderMessage:"",flightNum:this.flightNum,seatNum:this.seatInfo.seatNum,username:this.loginMember.username,status:"PROGRESS",orderList:[{orderCode:"B001",cnt:1}]};this.postOrders(t),this.$router.push("/waiting")},bandage:function(){var t={orderMessage:"",flightNum:this.flightNum,seatNum:this.seatInfo.seatNum,username:this.loginMember.username,status:"PROGRESS",orderList:[{orderCode:"B003",cnt:1}]};this.postOrders(t),this.$router.push("/waiting")},stomachache:function(){var t={orderMessage:"",flightNum:this.flightNum,seatNum:this.seatInfo.seatNum,username:this.loginMember.username,status:"PROGRESS",orderList:[{orderCode:"B002",cnt:1}]};this.postOrders(t),this.$router.push("/waiting")},moveEtc:function(){this.$router.push("/medical/etc")}})},m=(r(931),r(93)),component=Object(m.a)(h,(function(){var t=this,e=t._self._c;return e("div",{staticClass:"medical-box"},[e("div",{staticClass:"medical-box-item"},[e("div",{staticClass:"item-headache",on:{click:t.headache}},[e("img",{attrs:{src:"/medical/headache.png"}}),t._v(" "),e("div",[t._v("두통")])]),t._v(" "),e("div",{staticClass:"item-band",on:{click:t.bandage}},[e("img",{attrs:{src:"/medical/band-aid.png"}}),t._v(" "),e("div",[t._v("외상")])])]),t._v(" "),e("div",{staticClass:"medical-box-item"},[e("div",{staticClass:"item-stomachache",on:{click:t.stomachache}},[e("img",{attrs:{src:"/medical/stomachache.png"}}),t._v(" "),e("div",[t._v("복통")])]),t._v(" "),e("div",{staticClass:"item-etc",on:{click:t.moveEtc}},[e("img",{attrs:{src:"/medical/more.png"}}),t._v(" "),e("div",[t._v("기타")])])])])}),[],!1,null,"552fd27d",null);e.default=component.exports},807:function(t,e,r){var content=r(932);content.__esModule&&(content=content.default),"string"==typeof content&&(content=[[t.i,content,""]]),content.locals&&(t.exports=content.locals);(0,r(119).default)("6da7a77c",content,!0,{sourceMap:!1})},931:function(t,e,r){"use strict";r(807)},932:function(t,e,r){var d=r(118)(!1);d.push([t.i,'@font-face{font-family:"twayfly";src:url(https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_tway@1.0/twayfly.woff) format("woff");font-weight:400;font-style:normal}*[data-v-552fd27d]{margin:0;padding:0;font-family:"twayfly"}.medical-box[data-v-552fd27d]{background-color:hsla(0,0%,93.7%,.511);height:85vh;display:flex;flex-direction:column;padding:50px;font-size:30px}.medical-box-item[data-v-552fd27d]{display:flex;width:100%;height:50%}.item-headache[data-v-552fd27d]{width:50%;height:100%;display:flex;flex-direction:column;justify-content:center;align-items:center;cursor:pointer}.item-headache img[data-v-552fd27d]{width:30%;height:60%}.item-headache div[data-v-552fd27d]{height:20%}.item-band[data-v-552fd27d]{width:50%;height:100%;display:flex;flex-direction:column;justify-content:center;align-items:center;cursor:pointer}.item-band img[data-v-552fd27d]{width:30%;height:60%}.item-band div[data-v-552fd27d]{height:20%}.item-stomachache[data-v-552fd27d]{width:50%;height:100%;display:flex;flex-direction:column;justify-content:center;align-items:center;cursor:pointer}.item-stomachache img[data-v-552fd27d]{width:30%;height:60%}.item-stomachache div[data-v-552fd27d]{height:20%}.item-etc[data-v-552fd27d]{width:50%;height:100%;display:flex;flex-direction:column;justify-content:center;align-items:center;cursor:pointer}.item-etc img[data-v-552fd27d]{width:30%;height:60%}.item-etc div[data-v-552fd27d]{height:20%}',""]),t.exports=d}}]);