(window.webpackJsonp=window.webpackJsonp||[]).push([[4,30],{725:function(e,t,r){"use strict";r.r(t);var n=r(9),o=(r(32),r(908)),c=r.n(o),f=r(795),d={name:"VirtualKeyboard",props:{valueArr:Array,theme:String},data:function(){return{KeyData:f.default,shiftIndex:0,capsLock:0,lang:"kr",keyArr:[],keyValue:null}},methods:{classObject:function(e){switch(e){case"BackSpace":return{delete:!0};case"Tab":return{tab:!0};case"CapsLock":return{caps:!0};case"Enter":return{enter:!0};case"Shift":return 1===this.shiftIndex?{shift:!0,active:!0}:{shift:!0,active:!1};case"한/영":return"en"===this.lang?{lang:!0,active:!0}:{lang:!0,active:!1};case"space":return{space:!0};default:return{none:!1}}},keyEvent:function(e){var t=this;return Object(n.a)(regeneratorRuntime.mark((function r(){return regeneratorRuntime.wrap((function(r){for(;;)switch(r.prev=r.next){case 0:r.t0=e,r.next="Shift"===r.t0||"CapsLock"===r.t0?3:"한/영"===r.t0?5:"BackSpace"===r.t0?7:"space"===r.t0?9:17;break;case 3:return 1===t.shiftIndex?t.shiftIndex=0:t.shiftIndex=1,r.abrupt("break",25);case 5:return"kr"===t.lang?t.lang="en":t.lang="kr",r.abrupt("break",25);case 7:return t.delete(),r.abrupt("break",25);case 9:return r.next=11,t.keyArr.push(" ");case 11:return r.next=13,c.a.assemble(t.keyArr);case 13:return t.keyValue=r.sent,r.next=16,t.$emit("getKeyValue",t.keyValue);case 16:case 24:return r.abrupt("break",25);case 17:return r.next=19,t.keyArr.push(e);case 19:return r.next=21,c.a.assemble(t.keyArr);case 21:return t.keyValue=r.sent,r.next=24,t.$emit("getKeyValue",t.keyValue);case 25:case"end":return r.stop()}}),r)})))()},delete:function(){var e=this;return Object(n.a)(regeneratorRuntime.mark((function t(){return regeneratorRuntime.wrap((function(t){for(;;)switch(t.prev=t.next){case 0:return t.next=2,e.keyArr.pop();case 2:return t.next=4,c.a.assemble(e.keyArr);case 4:return e.keyValue=t.sent,t.next=7,e.$emit("getKeyValue",e.keyValue);case 7:case"end":return t.stop()}}),t)})))()},clearArray:function(){this.keyArr=[]}}},l=(r(909),r(93)),component=Object(l.a)(d,(function(){var e=this,t=e._self._c;return t("transition",{attrs:{name:"slide-fade"}},[t("div",{staticClass:"keyboard",class:e.theme},e._l(e.KeyData[e.lang],(function(r,n){return t("div",{key:n},[t("ul",e._l(r,(function(r,n){return t("li",{key:n,staticClass:"key",class:e.classObject(r[e.shiftIndex]),on:{click:function(){return e.keyEvent(r[e.shiftIndex])}}},["space"===r[e.shiftIndex]?t("span",{staticClass:"keyInfo"}):t("span",{staticClass:"keyInfo"},[e._v(e._s(r[e.shiftIndex]))])])})),0)])})),0)])}),[],!1,null,"241e9f98",null);t.default=component.exports},795:function(e,t,r){"use strict";r.r(t);t.default={kr:[[["`","~"],["1","!"],["2","@"],["3","#"],["4","$"],["5","%"],["6","^"],["7","&"],["8","*"],["9","("],["0",")"],["-","_"],["=","+"],["BackSpace","BackSpace"]],[["Tab","Tab"],["ㅂ","ㅃ"],["ㅈ","ㅉ"],["ㄷ","ㄸ"],["ㄱ","ㄲ"],["ㅅ","ㅆ"],["ㅛ","ㅛ"],["ㅕ","ㅕ"],["ㅑ","ㅑ"],["ㅐ","ㅒ"],["ㅔ","ㅖ"],["[","{"],["]","}"],["\\","|"]],[["CapsLock","CapsLock"],["ㅁ","ㅁ"],["ㄴ","ㄴ"],["ㅇ","ㅇ"],["ㄹ","ㄹ"],["ㅎ","ㅎ"],["ㅗ","ㅗ"],["ㅓ","ㅓ"],["ㅏ","ㅏ"],["ㅣ","ㅣ"],[";",":"],["'",'"'],["Enter","Enter"]],[["Shift","Shift"],["ㅋ","ㅋ"],["ㅌ","ㅌ"],["ㅊ","ㅊ"],["ㅍ","ㅍ"],["ㅠ","ㅠ"],["ㅜ","ㅜ"],["ㅡ","ㅡ"],[",","<"],[".",">"],["/","?"],["한/영","한/영"]],[["space","space"]]],en:[[["`","~"],["1","!"],["2","@"],["3","#"],["4","$"],["5","%"],["6","^"],["7","&"],["8","*"],["9","("],["0",")"],["-","_"],["=","+"],["BackSpace","BackSpace"]],[["Tab","Tab"],["q","Q"],["w","W"],["e","E"],["r","R"],["t","T"],["y","Y"],["u","U"],["i","I"],["o","O"],["p","P"],["[","{"],["]","}"],["\\","|"]],[["CapsLock","CapsLock"],["a","A"],["s","S"],["d","D"],["f","F"],["g","G"],["h","H"],["j","J"],["k","K"],["l","L"],[";",":"],["'",'"'],["Enter","Enter"]],[["Shift","Shift"],["z","Z"],["x","X"],["c","C"],["v","V"],["b","B"],["n","N"],["m","M"],[",","<"],[".",">"],["/","?"],["한/영","한/영"]],[["space","space"]]],num:[["7","8","9"],["4","5","6"],["1","2","3"],["","0",""]],email:[]}},796:function(e,t,r){var content=r(910);content.__esModule&&(content=content.default),"string"==typeof content&&(content=[[e.i,content,""]]),content.locals&&(e.exports=content.locals);(0,r(119).default)("1a6b273c",content,!0,{sourceMap:!1})},908:function(e,t,r){var n;!function(){"use strict";var o,c,f,d,l,h,x=["ㄱ","ㄲ","ㄴ","ㄷ","ㄸ","ㄹ","ㅁ","ㅂ","ㅃ","ㅅ","ㅆ","ㅇ","ㅈ","ㅉ","ㅊ","ㅋ","ㅌ","ㅍ","ㅎ"],y=["ㅏ","ㅐ","ㅑ","ㅒ","ㅓ","ㅔ","ㅕ","ㅖ","ㅗ",["ㅗ","ㅏ"],["ㅗ","ㅐ"],["ㅗ","ㅣ"],"ㅛ","ㅜ",["ㅜ","ㅓ"],["ㅜ","ㅔ"],["ㅜ","ㅣ"],"ㅠ","ㅡ",["ㅡ","ㅣ"],"ㅣ"],v=["","ㄱ","ㄲ",["ㄱ","ㅅ"],"ㄴ",["ㄴ","ㅈ"],["ㄴ","ㅎ"],"ㄷ","ㄹ",["ㄹ","ㄱ"],["ㄹ","ㅁ"],["ㄹ","ㅂ"],["ㄹ","ㅅ"],["ㄹ","ㅌ"],["ㄹ","ㅍ"],["ㄹ","ㅎ"],"ㅁ","ㅂ",["ㅂ","ㅅ"],"ㅅ","ㅆ","ㅇ","ㅈ","ㅊ","ㅋ","ㅌ","ㅍ","ㅎ"],k=44032;function m(e){for(var t=e.length,r={0:0},i=0;i<t;i++)e[i]&&(r[e[i].charCodeAt(0)]=i);return r}function C(e){for(var t,r,n=e.length,o={},i=0;i<n;i++)t=e[i][0].charCodeAt(0),r=e[i][1].charCodeAt(0),void 0===o[t]&&(o[t]={}),o[t][r]=e[i][2].charCodeAt(0);return o}function w(e){return void 0!==o[e]}function A(e){return void 0!==c[e]}function j(e){return void 0!==f[e]}function S(e){return void 0!==d[e]}function V(e){return 44032<=e&&e<=55203}function I(a,b){return!(!h[a]||!h[a][b])&&h[a][b]}function z(a,b){return!(!l[a]||!l[a][b])&&l[a][b]}o=m(["ㄱ","ㄲ","ㄳ","ㄴ","ㄵ","ㄶ","ㄷ","ㄸ","ㄹ","ㄺ","ㄻ","ㄼ","ㄽ","ㄾ","ㄿ","ㅀ","ㅁ","ㅂ","ㅃ","ㅄ","ㅅ","ㅆ","ㅇ","ㅈ","ㅉ","ㅊ","ㅋ","ㅌ","ㅍ","ㅎ"]),c=m(["ㄱ","ㄲ","ㄴ","ㄷ","ㄸ","ㄹ","ㅁ","ㅂ","ㅃ","ㅅ","ㅆ","ㅇ","ㅈ","ㅉ","ㅊ","ㅋ","ㅌ","ㅍ","ㅎ"]),f=m(["ㅏ","ㅐ","ㅑ","ㅒ","ㅓ","ㅔ","ㅕ","ㅖ","ㅗ","ㅘ","ㅙ","ㅚ","ㅛ","ㅜ","ㅝ","ㅞ","ㅟ","ㅠ","ㅡ","ㅢ","ㅣ"]),d=m(["","ㄱ","ㄲ","ㄳ","ㄴ","ㄵ","ㄶ","ㄷ","ㄹ","ㄺ","ㄻ","ㄼ","ㄽ","ㄾ","ㄿ","ㅀ","ㅁ","ㅂ","ㅄ","ㅅ","ㅆ","ㅇ","ㅈ","ㅊ","ㅋ","ㅌ","ㅍ","ㅎ"]),l=C([["ㄱ","ㅅ","ㄳ"],["ㄴ","ㅈ","ㄵ"],["ㄴ","ㅎ","ㄶ"],["ㄹ","ㄱ","ㄺ"],["ㄹ","ㅁ","ㄻ"],["ㄹ","ㅂ","ㄼ"],["ㄹ","ㅅ","ㄽ"],["ㄹ","ㅌ","ㄾ"],["ㄹ","ㅍ","ㄿ"],["ㄹ","ㅎ","ㅀ"],["ㅂ","ㅅ","ㅄ"]]),h=C([["ㅗ","ㅏ","ㅘ"],["ㅗ","ㅐ","ㅙ"],["ㅗ","ㅣ","ㅚ"],["ㅜ","ㅓ","ㅝ"],["ㅜ","ㅔ","ㅞ"],["ㅜ","ㅣ","ㅟ"],["ㅡ","ㅣ","ㅢ"]]);var E=function(e,t){if(null===e)throw new Error("Arguments cannot be null");"object"==typeof e&&(e=e.join(""));for(var r,n,o,code,l,h=[],m=e.length,i=0;i<m;i++){var C=[];V(code=e.charCodeAt(i))?(n=((code-=k)-(o=code%28))/28%21,r=parseInt((code-o)/28/21),C.push(x[r]),"object"==typeof y[n]?C=C.concat(y[n]):C.push(y[n]),o>0&&("object"==typeof v[o]?C=C.concat(v[o]):C.push(v[o]))):w(code)?"string"==typeof(l=A(code)?x[c[code]]:v[d[code]])?C.push(l):C=C.concat(l):j(code)?"string"==typeof(l=y[f[code]])?C.push(l):C=C.concat(l):C.push(e.charAt(i)),t?h.push(C):h=h.concat(C)}return h},_=function(e){return"string"!=typeof e?"":(e=E(e)).join("")},L=function(e){"string"==typeof e&&(e=E(e));var code,t,r=[],n=e.length,o=0,l=-1,h=!1;function x(t){var n,o,x,y,v=0,m="";if(h=!1,!(l+1>t))for(var C=1;;C++){if(1===C){if(j(n=e[l+C].charCodeAt(0)))return l+C+1<=t&&j(o=e[l+C+1].charCodeAt(0))?(r.push(String.fromCharCode(I(n,o))),void(l=t)):(r.push(e[l+C]),void(l=t));if(!A(n))return r.push(e[l+C]),void(l=t);m=e[l+C]}else if(2===C){if(A(o=e[l+C].charCodeAt(0)))return n=z(n,o),m=String.fromCharCode(n),r.push(m),void(l=t);m=String.fromCharCode(28*(21*c[n]+f[o])+k)}else 3===C?(I(o,x=e[l+C].charCodeAt(0))?o=I(o,x):v=x,m=String.fromCharCode(28*(21*c[n]+f[o])+d[v]+k)):4===C?(v=z(v,y=e[l+C].charCodeAt(0))?z(v,y):y,m=String.fromCharCode(28*(21*c[n]+f[o])+d[v]+k)):5===C&&(v=z(v,y=e[l+C].charCodeAt(0)),m=String.fromCharCode(28*(21*c[n]+f[o])+d[v]+k));if(l+C>=t)return r.push(m),void(l=t)}}for(var i=0;i<n;i++)A(code=e[i].charCodeAt(0))||j(code)||S(code)?(0===o?A(code)?o=1:j(code)&&(o=4):1==o?j(code)?o=2:z(t,code)?o=5:x(i-1):2==o?S(code)?o=3:j(code)?I(t,code)||(x(i-1),o=4):(x(i-1),o=1):3==o?S(code)?!h&&z(t,code)?h=!0:(x(i-1),o=1):A(code)?(x(i-1),o=1):j(code)&&(x(i-2),o=2):4==o?j(code)?I(t,code)?(x(i),o=0):x(i-1):(x(i-1),o=1):5==o&&(j(code)?(x(i-2),o=2):(x(i-1),o=1)),t=code):(x(i-1),x(i),o=0);return x(i-1),r.join("")};function O(e){this.string=e,this.disassembled=E(e).join("")}O.prototype.search=function(e){return E(e).join("").indexOf(this.disassembled)};var B={disassemble:E,d:E,disassembleToString:_,ds:_,assemble:L,a:L,search:function(a,b){var e=E(a).join(""),t=E(b).join("");return e.indexOf(t)},rangeSearch:function(e,t){var r,n=E(e).join(""),o=E(t).join(""),c=E(e,!0),f=new RegExp(o,"gi"),d=[];if(!t.length)return[];for(;r=f.exec(n);)d.push(r.index);function l(e){for(var i=0,t=0;i<c.length;++i)if(e<(t+=c[i].length))return i}function h(e){for(var i=0,t=0;i<c.length;++i)if(t+=c[i].length,e+o.length<=t)return i}return d.map((function(i){return[l(i),h(i)]}))},Searcher:O,endsWithConsonant:function(e){"object"==typeof e&&(e=e.join(""));var code=e.charCodeAt(e.length-1);if(V(code)){if((code-=k)%28>0)return!0}else if(w(code))return!0;return!1},endsWith:function(e,t){return E(e).pop()===t},isHangul:function(e){return"string"==typeof e&&(e=e.charCodeAt(0)),V(e)},isComplete:function(e){return"string"==typeof e&&(e=e.charCodeAt(0)),V(e)},isConsonant:function(e){return"string"==typeof e&&(e=e.charCodeAt(0)),w(e)},isVowel:function(e){return"string"==typeof e&&(e=e.charCodeAt(0)),j(e)},isCho:function(e){return"string"==typeof e&&(e=e.charCodeAt(0)),A(e)},isJong:function(e){return"string"==typeof e&&(e=e.charCodeAt(0)),S(e)},isHangulAll:function(e){if("string"!=typeof e)return!1;for(var i=0;i<e.length;i++)if(!V(e.charCodeAt(i)))return!1;return!0},isCompleteAll:function(e){if("string"!=typeof e)return!1;for(var i=0;i<e.length;i++)if(!V(e.charCodeAt(i)))return!1;return!0},isConsonantAll:function(e){if("string"!=typeof e)return!1;for(var i=0;i<e.length;i++)if(!w(e.charCodeAt(i)))return!1;return!0},isVowelAll:function(e){if("string"!=typeof e)return!1;for(var i=0;i<e.length;i++)if(!j(e.charCodeAt(i)))return!1;return!0},isChoAll:function(e){if("string"!=typeof e)return!1;for(var i=0;i<e.length;i++)if(!A(e.charCodeAt(i)))return!1;return!0},isJongAll:function(e){if("string"!=typeof e)return!1;for(var i=0;i<e.length;i++)if(!S(e.charCodeAt(i)))return!1;return!0}};void 0===(n=function(){return B}.call(t,r,t,e))||(e.exports=n)}()},909:function(e,t,r){"use strict";r(796)},910:function(e,t,r){var n=r(118)(!1);n.push([e.i,".keyboard[data-v-241e9f98]{-ms-align-items:center;-moz-align-items:center;-o-align-items:center;align-items:center;display:-moz-flex;display:-o-flex;display:flex;-moz-flex-direction:column;-o-flex-direction:column;flex-direction:column;width:1400px;height:400px;bottom:0;left:50%;border-radius:0;z-index:9999;background:#1a1a1a;padding-top:30px}.keyboard .key[data-v-241e9f98]{display:block;color:#fff;text-decoration:none;text-align:center;width:80px;height:60px;line-height:58px;margin:2.5px;background:#333;font-size:18px;border-radius:4px}.keyboard .key[data-v-241e9f98]:active,.keyboard .keydown[data-v-241e9f98]{border-radius:4px;color:#fff;background:#5773ff}.keyboard ul[data-v-241e9f98]{display:-moz-flex;display:-o-flex;display:flex;-ms-align-items:center;-moz-align-items:center;-o-align-items:center;align-items:center;margin:0;padding:0}.keyboard ul .delete[data-v-241e9f98]{width:130px}.keyboard ul .tab[data-v-241e9f98]{width:100px}.keyboard ul .caps[data-v-241e9f98]{width:110px}.keyboard ul .enter[data-v-241e9f98]{width:160px}.keyboard ul .lang[data-v-241e9f98],.keyboard ul .shift[data-v-241e9f98]{width:130px}.keyboard ul .space[data-v-241e9f98]{width:535px}.keyboard ul .active[data-v-241e9f98]{background:#5773ff;color:#fff}.keyboard ul li[data-v-241e9f98]{display:-moz-flex;display:-o-flex;display:flex;-ms-justify-content:center;-moz-justify-content:center;-o-justify-content:center;justify-content:center;-ms-align-items:center;-moz-align-items:center;-o-align-items:center;align-items:center}.keyboard ul img[data-v-241e9f98]{width:30%;margin-top:18px}.white[data-v-241e9f98]{background:#f2f2f2;box-shadow:inset 0 5px 20px rgba(0,0,0,.4)}.white .key[data-v-241e9f98]{background:#fff;color:#333;box-shadow:1px 1px 2px 1px #ccc}.white ul .caps[data-v-241e9f98],.white ul .delete[data-v-241e9f98],.white ul .enter[data-v-241e9f98],.white ul .lang[data-v-241e9f98],.white ul .shift[data-v-241e9f98],.white ul .space[data-v-241e9f98],.white ul .tab[data-v-241e9f98]{background:#f3f3f3}.white-shadow[data-v-241e9f98]{background:#ccc;box-shadow:inset 0 5px 30px rgba(99,96,96,.4);padding:50px 0 0}.white-shadow .key[data-v-241e9f98]{display:block;color:#aaa;text-decoration:none;text-align:center;background:#eff0f2;border-radius:4px;border-top:1px solid #f5f5f5;margin:5px;box-shadow:inset 0 0 25px #e8e8e8,0 1px 0 #c3c3c3,0 2px 0 #c9c9c9,0 2px 3px #333;text-shadow:0 1px 0 #f5f5f5;filter:dropshadow(color=#f5f5f5,offx=0,offy=1)}.white-shadow .key[data-v-241e9f98]:active,.white-shadow .keydown[data-v-241e9f98]{color:#888;background:#ebeced;box-shadow:inset 0 0 25px #ddd,0 0 3px #333;border-top:1px solid #eee}.slide-fade-enter-active[data-v-241e9f98]{transition:all .3s ease}.slide-fade-leave-active[data-v-241e9f98]{transition:all .3s cubic-bezier(1,.5,.8,1)}.slide-fade-enter[data-v-241e9f98],.slide-fade-leave-to[data-v-241e9f98]{transform:translateY(400px);opacity:0}",""]),e.exports=n}}]);