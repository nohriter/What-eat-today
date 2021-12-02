package program.swing.whatTodayEat;

import java.util.HashMap;
import java.util.Map;

public class RestaurantData {
    private Integer id = 0;
    private final Map<Integer, Restaurant> restaurants = new HashMap<>();

    public RestaurantData() {
        restaurants.put(generatedId(), new Restaurant(id,"고가네철판불백",300,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"곰작골나주곰탕",300,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"전주명가감자탕",300,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"언주집(돼지고기구이) ",300,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"신의주찹쌀순대",300,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"조순금닭도리탕",300,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"오륙도(해물,생선)",300,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"시원한대구탕",300,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"대영식당(백반)",300,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"곰바로곰탕",300,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"김밥천국",300,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"통돼지두루치기김치찌개전문점",300,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"경성밥상(현대식백반)",300,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"연어&육회 셰프클라쓰",300,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"뱅뱅막국수",300,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"해우리(한정식)",300,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"무화잠(게요리)",300,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"참족(족발보쌈)",300,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"예당(한식)",300,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"낙여삼(낙지요리)",300,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"뚝딱짜글이 & 제육",300,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"명동할머니국수",300,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"원할매이모네닭한마리",300,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"온돌집",300,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"두메(낙지볶음)",300,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"로라방앗간(떡볶이)",300,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"등촌샤브칼국수",300,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"소풍김밥분식",300,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"봇밥(덮밥)",300,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"십원집(돼지고기)",300,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"서강쇠떡볶이",300,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"영동소금구이",300,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"왕두꺼비부대찌개",300,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"더고기(소고기)",300,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"호돌이떡볶이",300,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"home two(도시락)",300,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"한방삼계탕",500,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"풍년참숯갈비",500,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"미사리밀빛초계국수",500,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"전주현대옥",500,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"나주곰탕",500,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"두찜",500,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"또시락",500,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"유명한참숯달갈비",500,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"시골집",500,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"무봤나 3대 가야밀면",500,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"백순대 삼촌네",500,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"알찬떡볶이",500,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"도곡 한우소머리국밥",500,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"전주식당",500,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"버드나무집",500,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"한국수",500,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"밥밥디라라",500,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"밥사부",1000,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"소호정(국수)",1000,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"짚신매운갈비",1000,"한식"));

        restaurants.put(generatedId(), new Restaurant(id,"아오리의행방불명(라멘)",300,"일식"));
        restaurants.put(generatedId(), new Restaurant(id,"스밋코(덮밥)",300,"일식"));
        restaurants.put(generatedId(), new Restaurant(id,"교토일식(회)",300,"일식"));
        restaurants.put(generatedId(), new Restaurant(id,"린카(카레)",300,"일식"));
        restaurants.put(generatedId(), new Restaurant(id,"방파제횟집",300,"일식"));
        restaurants.put(generatedId(), new Restaurant(id,"카츠오우(돈가스)",300,"일식"));
        restaurants.put(generatedId(), new Restaurant(id,"스노우폭스",300,"일식"));
        restaurants.put(generatedId(), new Restaurant(id,"브라더솔밥&후토마키",300,"일식"));
        restaurants.put(generatedId(), new Restaurant(id,"스시어부",300,"일식"));
        restaurants.put(generatedId(), new Restaurant(id,"육회로운연어생활",500,"일식"));
        restaurants.put(generatedId(), new Restaurant(id,"해밀",300,"일식"));
        restaurants.put(generatedId(), new Restaurant(id,"사보텐",500,"일식"));
        restaurants.put(generatedId(), new Restaurant(id,"그우동집",500,"일식"));
        restaurants.put(generatedId(), new Restaurant(id,"쿠모야(라멘)",500,"일식"));
        restaurants.put(generatedId(), new Restaurant(id,"만스시",500,"일식"));
        restaurants.put(generatedId(), new Restaurant(id,"진스시",500,"일식"));
        restaurants.put(generatedId(), new Restaurant(id,"돈스라(돈가스)",500,"일식"));
        restaurants.put(generatedId(), new Restaurant(id,"도쿄라멘",1000,"일식"));

        restaurants.put(generatedId(), new Restaurant(id,"노브랜드",300,"양식"));
        restaurants.put(generatedId(), new Restaurant(id,"피자헛",300,"양식"));
        restaurants.put(generatedId(), new Restaurant(id,"La Main de Chef(이탈리아 음식)",300,"양식"));
        restaurants.put(generatedId(), new Restaurant(id,"써브웨이",300,"양식"));
        restaurants.put(generatedId(), new Restaurant(id,"이엘포레스트",300,"양식"));
        restaurants.put(generatedId(), new Restaurant(id,"조박사돈까스",300,"양식"));
        restaurants.put(generatedId(), new Restaurant(id,"라토마티나",300,"양식"));
        restaurants.put(generatedId(), new Restaurant(id,"맥도날드",300,"양식"));
        restaurants.put(generatedId(), new Restaurant(id,"포몬스",500,"양식"));
        restaurants.put(generatedId(), new Restaurant(id,"계몽돈까쓰",500,"양식"));
        restaurants.put(generatedId(), new Restaurant(id,"버거집",500,"양식"));
        restaurants.put(generatedId(), new Restaurant(id,"듀크버거",500,"양식"));
        restaurants.put(generatedId(), new Restaurant(id,"라그릴리아",500,"양식"));
        restaurants.put(generatedId(), new Restaurant(id,"로드빌",500,"양식"));
        restaurants.put(generatedId(), new Restaurant(id,"스파게티스토리",500,"양식"));
        restaurants.put(generatedId(), new Restaurant(id,"로마옥",500,"양식"));
        restaurants.put(generatedId(), new Restaurant(id,"이올로화덕피자",500,"양식"));
        restaurants.put(generatedId(), new Restaurant(id,"디오파스타돈까스",1000,"양식"));
        restaurants.put(generatedId(), new Restaurant(id,"미즈컨테이너",1000,"양식"));

        restaurants.put(generatedId(), new Restaurant(id,"리첸",300,"중식"));
        restaurants.put(generatedId(), new Restaurant(id,"사천루",300,"중식"));
        restaurants.put(generatedId(), new Restaurant(id,"대려도",300,"중식"));
        restaurants.put(generatedId(), new Restaurant(id,"만다린",300,"중식"));
        restaurants.put(generatedId(), new Restaurant(id,"중화반점",300,"중식"));
        restaurants.put(generatedId(), new Restaurant(id,"다원",300,"중식"));
        restaurants.put(generatedId(), new Restaurant(id,"라이라이",300,"중식"));
        restaurants.put(generatedId(), new Restaurant(id,"홍리마라탕",1000,"중식"));
        restaurants.put(generatedId(), new Restaurant(id,"중경마라탕",1000,"중식"));
    }

    private Integer generatedId() {
        return id++;
    }

    public Map<Integer, Restaurant> getAllRestaurants() {
        return restaurants;
    }
}
