package kr.kookmin.jeongo3.DISC;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@AllArgsConstructor
public enum DISCCode {

    // D유형
    D("감독자형",
            "강력한 업무 추진력 , 전체를 보는 통합적 시각, 어려운 상황 발생 시 개인적 능력으로 돌파 , 초긍정 에너지",
            "강한 자아를 소유하고 있으며, 높은 성취의 기준을 지닌 리더형이다, 평범한 것을 싫어하고 새로운 도전을 찾는다. 목적을 달성하기 위해서 사람과 상황을 조종한다. 큰비전을 가지고 있으며, 강한 열정으로 계획을 실행한다. 타인의 압력 아래서 의사 소통이 어려울 수 있다. 결정을 내리기 전 이미 일의 방향, 해결책을 직곽으로 파악",
            "건축가 , 사업가 , 군인 , 탐험가 , 영화 감독 , 오케스트라 , 지휘자"),
    DI("결과 지향형",
            "미래 지향적 , 빠른 결과와 동기부여 , 긍정적 , 리더십 , 꿈의 사람 , 설득력 , 낙관주의 , 용기와 격려",
            "강요적이고 지배적으로 개인주의자가 될 소지가 크다 , 앞을 내다보며 전진해서 목표를 성취하려고 하며 호기심이 강하고 관심 영역이 넓다. 문제 해결에 논리적이고 훌륭한 리더의 자질을 갖추고 있지만, 압력이 가해지면 다투거나 자신의 의지를 밀어 붙이기도 한다. 도전적인 것을 추구하며, 사람들에게 강한 영향력을 미치고 , 목표를 성취할 수 있도록 동기를 자극하는 걸 잘한다.",
            "사업가 , 탐험가 , 정치인 , 영업사원 ,  상황 판단실 관리 , 건축가"),
    DIS("관계중심적 지도자형",
            "인간 배려의 리더십 , 팀플레이를 잘하는 리더십 , 약자 배려의 리더십 , 팀원에게 용기와 비전을 심어줌",
            "목표를 위해 업무를 추진하는 놀라운 능력을 지니고 있다. 열정적이고 사회적이며 전체적인 목표에 초점을 두고, 전반적 이거나 대국적인 면에서 해야할 일을 분배한다. 스트레스 받는 상황에서 결정을 내리고 끝까지 밀어 붙이는데 뛰어나다. 다른 사람이 목표를 찾는 것을 도와주기 위해 최선을 다하며 호의 적이다. 창의 적이고 열정적으로 일하며 좋은 결과를 성취하기 위해 노력한다.",
            "국회 의원 , 지방 행정관 , 교육 단체장 , 목회자 , 사회 복지 사업가"),
    DIC("대법관형",
            "명료한 결정 , 공정한 판결과 지시 , 혼란할 때의 명확한 기준 제시 , 세밀하면서 확실한 근거로 다가가는 설득력 , 사람을 설득하여 일을 나누고 본인도 함께함",
            "무언가 완성하기 위해 중심이 되는 사람과의 관계를 유지하는 데에 열정적이다 . 사람과 즐기는 것을 좋아하지만, 일할 때는 날카롭다. 사교적임에도 주의를 기울여야 하는 세부사항에 대해서 확실하다. 존경 받고 지배하길 갈망하며 완벽해지기 위해 스스로 업무를 마무리 한다. 시작에 있어 망설이지 않고, 결론을 위해 움직이며 문제를 해결하고 재빠르게 생각하고 정확하게 결과를 도출해낸다. 명료하고 간결한 걸 추구한다.",
            "정치인 , 법관 , 벤처 기업가 , 스타트업"),
    DS("성취자형",
            "업무의 성취의 전문성 , 전문적 분야의 조예 , 한 분야의 거장 , 성취 중심",
            "객관적이며, 분석적인 사람이다. 목표에 따라 동기가 유발되는 업무 중심의 사람이며, 끈질긴 결정력과 차분한 안정성, 견디는 것에 능한 사람이다. 독립적이고 질문을 많이 하는 접근 방법을 가지고 있으며, 결과로 남들을 평가하는 실용적인 사람이다. 결과에 대한 압박으로 인하여 무뚝뚝해지고 감정을 잘 드러내지 않을 수 있다 .",
            "건축가 , 수공예 기능인 , 기술 제작자"),
    DSI("업무 중심적 지도자형",
            "목전의 일을 푸는 데 탁월한 능력, 고민 없는 실천자, 긍정적 목표를 세우고 필요한 사람들을 설득함",
            "자기 일에 전문적인 식견을 가진 사람이며 , ds 형과는 다르게 사람에 대한 따듯한 배려심을 품고 있다.지도 능력에도 일가견이 있어, 어려움에 마주쳤을 때 강한 리더십을 발휘하여 해결사로서 역할을 한다.타인과 충돌 하면서 까지 자신을 드러내려 하지 않으며, 섣불리 나서지 않는다. 욱하며 화를 잘내기도 하고 어떤때는 말을 들어주다가도, 혼자서 다 결론지을 때도 있다. 낭만적이고 삶을 즐길 줄 아는 유형이다.",
            "제조업 종사자 , 부사관 , 수리공"),
    DSC("전문가형",
            "장기적인 고난도  업무에 적합, 결국은 자기 분야의 정상에 서는 장인, 꾸준하면서도 정확한 업무 추진 능력, 책임감이 강함",
            "자신의 직접 설계하고 실행으로 옮길 수 있는 능력을 갖춘 사람이다. 전체적인 큰 그림을 그리고, 상세한 실행 계획을 세운 다음 추진자가 되어 실행으로 옮기는 사람이다. 어떤일을 맡아도 섬세하고 완벽하게 완수 할 수 있으며 항상 책임감을 가지고 일에 임한다. 구속하는 것을 싫어하며 자신만의 고유한 영역에서 일하는 것을 좋아한다. 잔꾀를 부리지 않고 스스로 해야할 일을 알아서 계획하고, 오롯이 실천하는 고독한 전문가이다.",
            "대기업 임원 , 출판 업계 , 건축업 , 제조업 , 국가 장기 프로젝트 사업 담당자"),
    DC("개척자형",
            "미지의 세계에 도전, 지치지 않음, 분야의 경지를 넓혀감, 연구와 실행, 마무리까지 완벽함 , 확실한 결과물",
            "2가지 문제를 동시에 인식하고 실행할 수 있는 능력이 있다.문제 해결에 필요한 모든 방법을 연구 할 수 있으며, 눈에 보이는 결과를 얻어내려 노력한다. 업무 시 개인적인 감정을 포함하지 않으며 감정을 자제하는 능력을 통해 진실만들 말한다. 더 나은 길을 발견한다면 충분히 그것에 도전하며, 중대한 사항을 맞이 함에 있어 두려움이 없다. 자신의 페이스를 유지하며 휴식 시간 없이 일하는 것을 조심해야 한다. 훌륭한 경영자 로서 완벽한 업무 수행을 위해 좋은 방법을 찾기도 한다.",
            "벤처, 스타트업 사업가 , 탐험가 , 고고학자 , 대기업 임원 , 오케스트라 지휘자 , 비행기 기장"),
    DCI("대중 강사형",
            "정확한 논리와 분명한 자료로 탁월한 설득 , 이해하기 쉽게 설명함 , 필요에 따라서 사실적 이야기와 은유적 이야기를 자유롭게 구사함, 어려운 상황에 등장하는 웅변가 스타일",
            "비전 제시자이며 인생의 확고한 비전이 있고 그 꿈을 이루기 위해 부지런히 달려가는 사람이다. 하지만 자신의 꿈만 이루면 된다는 이기주의자는 아니다. 이성적이면서도 사람을 배려할 줄 알고, 냉혹하면서 유머 있는 매력적인 유형이다. 삶이나 사건의 핵심을 차가운 논리로 조직하고 화려한 언어로 가르치는 사람이다. 자신에게 도움을 요청하고 , 존경해주기를 바라며 자신의 이야기를 들어주는 사람이 많을 수록 좋아한다. 스스로에 대해 얘기하는 쇼맨십이 풍부한 사람이다.",
            "강사 , 시사 평론가 , 웅변가 , 정치인 , 방송인,  유튜버 등"),
    DCS("마이스터형",
            "유형 중 가장 일의 완성도가 높은 사람, 평생 1가지 일을 완성하는 사람 , 굳건한 의지로 고집이 셈, 자기 사상과 자기 신념에 따른 분명한 행동",
            "개척자형 보다 훨씬 강한 업무 중심의 구조를 갖는다. 사람을 사귀고 함께 노는 일에는 아무런 관심이 없다. 머릿속에는 오직 일 생각뿐이며 다른 사람이 해놓은 일을 하는 데에도 관심이 없다. 한 분야의 최고 전문가 이며 당대의 거장이 될 가능성이 크다. 누군가가 이미 만들어 놓은 시스템에서는 기능을 발휘하지 않는다. 섬세하고 고집이 세며 자신의 영역에서 양보 하지 않는다. 무수한 자료들을 직접 시각화하고 전문적인 기술을 가지는 것에 탁월하다.",
            "제조업 분야 , 국가 관련 사업 담당자 , 국토 토건 사업 담당자 , 우주탐사 프로그램 개발"),


    // I유형
    I("분위기 메이커형",
            "사람에 호의적 , 분위기를 즐겁게 함 , 긍정적 에너지 , 디자인 감각",
            "매우 열정적이고 낙천적이다. 의사소통에 명료하며 압력이 가해질때에도 밝은 표정을 유지한다.  사회적인 인정을 목표로 삼고 , 쉽게 친구를 사귀며 호의적인 분위기를 잘 조성한다. 그러나 때로는 경솔할 수도 있다. 체계적인 시간표가 필요하며 , 함께 일하는 방식을 좋아한다.",
            "아나운서 , 디자이너 ,  아티스트 , 연예인 , 쇼 호스트"),
    ID("설득자형",
            "긍정적 ,  미래 지향적 , 설득력 , 관계 해결 능력 , 갈등 관리",
            "정신적으로 자유로우며 , 사람에게 많은 관심이 있다. 우호적인 사람을 이용하여 목표를 이루고자 한다. 명성과 권위를 원하며 주어진 임무에 도전 의식을 가지며 성공으로 이끈다. 지원자나 협력자가 될 수 있으며 , 주위 사람들과 효과적이고 효율적인 대화를 한다. 떄로는 자존심이 센 사람으로 보여질 수 있다. 낙천적이고 동기 유도적이며 사람들을 통해 어떻게 결과를 얻어낼 수 있을 지 안다.",
            "정치인 , 방송인 , 프로듀서 , 기획자 , 사업가 , 연예인 , 예술인 , 강사"),
    IDS("정치가형",
            "긍정적 , 조직을 설득하여 이끌어나감 , 배려심 ,매력적 리더십 , 미래 비전을 심어줌",
            "사교적이며 , 우호적인 성향으로 상황을 이끌어 가거나 리더가 되고 싶어한다. 타인에게 관심을 두고 상황에 순응해 나간다. 주어진 일을 완벽히 마치기 위해 집중하지만, 자신의 한계와 취약점을 잘 알고 있어 필요할 때는 주위에 도움을 요청한다. 리더로써 훌륭하고 자신의 능력을 기꺼이 공유한다. 사회 활동의 중심에서 서로 관계를 맺고 자신의 솔직함을 이용해 인관 관계나 직장에서 발생할 수 있는 논쟁을 해결한다. 뛰어난 사회성으로 인해 훌륭한 동기부여가로서 탁월하다.",
            "정치인 , 마케터 , 상품 기획자 , 보험 설계사"),
    IDC("지도자형",
            "가장 모범적인 리더형 , 정직과 도덕성을 기반한 설득력 , 명료한 근거를 바탕으로 한 설득력 , 자아 성찰과 자기 반성의 실현 , 미래사회에 대한 비전 제시",
            "과업 지향적이면서도 사람들과 돈독한 관계를 유지하는 것 역시 중요하게 생각한다. 일을 옳바르고 정확하게 해내기를 원하기 때문에 특정 상황에서는 압박감을 받는다. 뛰어난 의사소통 기슬을 통해 낯선 타인들 까지 편안하고 , 느긋함을 느끼도록 만든다.",
            "교수 , 정치인,  강사 , 기획자 , 연설가 , 예술가"),
    IS("격려자형",
            "사람 좋은 , 따뜻한 , 배려심 , 위로자 , 사람을 좋아함",
            "좋은 경청자이며 사람들이 많이 다가온다. 억지로 자기 생각을 다른 사람에게 주입 시키려 하지 않는다. 심각한 문제에는 소극적이며 지나치게 참고 인내하다 비생산적일 수 있다. 격려자형은 개인적이고 친밀한 사람들과 어울리기를 좋아한다. 맡은 일을 잘 해냈을 때 독려 받는 것을 좋아한다.",
            "사회 복지사 , 세일즈맨 , 관광업 , 요양 보호사 , 각종 서비스업"),
    ISD("헌신자형",
            "팀을 위해 자기 희생 , 따뜻한 심성 , 부드러운 언어와 타인을 배려하는 행동",
            "어떠한 목표에 따라 자극을 받았을 때에 격려하는 스타일이며 일을 수행하면서 주도적인 임무를 맡고 싶어하고, 도우미 역할도 가능하다. 지원하는 역할에 행복해하고 만족하기 위해서 주변의 인정이 필요하다. 다름 사람의 기분을 잘 고려하며 자신의 뛰어난 능력을 사용하여 주어진 업무를 빠르고 효율적으로 수행한다.뛰어난 문제 해결 능력을 가지고 있으며, 도전을 주저하지 않고 긍정적인 결과를 얻기 위해 노력한다.",
            "간호사 , 사회 복지사 , 심리 상담사 , 자율 봉사자"),
    ISC("코치형",
            "부드러운 인상 , 지혜로운 경청자 , 예리한 질문 , 배려의 언어 , 세부사항 숙지",
            "자상하며 남을 배려하는 사람이며 자신이 영향을 미치며 주변 사람들이 성장하는 것을 좋아한다. 은근히 자신의 업적이나 다른 사람에게 미친 영향을 알아주길 원한다. 타인에게 언제나 긍정적이며 좋은 말로 다름 사람들의 마음을 밝게 해준다. 사람 속에 있는 가능성을 일깨워주며 항상 행복하게 사는 법을 가르쳐준다.",
            "코치 , 상담사 , 컨설턴트 , 승무원 , 변호사 , 번역가"),
    IC("대인 협상가형",
            "긍정과 부정 2개의 감정 공존 , 예술적 표현 능력 , 언어적 감각 , 미학의 천재들 , 감정 표현과 문학적 능력 , 차분한 설득력과 논리",
            "사교성이 좋아 사람들과 어울리는 것을 좋아한다. 하지만 집에서 자기만의 시간을 가지는 것도 즐긴다. 의도적으로 다른 사람과 반대 관점에 서지 않도록 자신을 제어한다. 시간을 통제하고 계획을 까다롭게 짠다. 그러면서 본인은 통제로부터 자유로워지길 원한다.",
            "강사 , 세일즈맨 , 변호사 , 중개업"),
    ICD("업무 협상가형",
            "탁월한 발상과 실천 능력 , 논리와 설득력,  즐거운 상상과 실천 , 마음을 읽는 능력",
            "현대사회에서 가장 선호하는 사람의 유형이며 , 사람에 관대하면서 자기 일에는 철저히 분석적이고 실천 능력을 가지고 있다. 타고난 논리적인 설득력으로 사건을 잘 해결하는 강점이 있다. 사람의 마음을 읽을 줄 알며, 마음을 여는 방법도 안다. 상대에 대한 배려심이 뛰어나고 관용도 베푼다. 그러나 아무 조건 없이 관용을 베풀지는 않는다. 서로 손해가 없는 것을 선호하며 평화를 만들고 모든 것이 잘 조화롭도록 한다.예술적인 부분에서도 탁월할 수 있으며 , 결코 손해 보려하지 않고 철저하게 실리적이고 계산적이다.",
            "협상가 , 경찰 , 설계자 , PD , 방송 작가"),
    ICS("조정자형",
            "부드러운 칼, 인간에 대한 이해력 , 상황에 대한 인간적 배려 , 사람의 마음을 잘 다룸,  감정적 공감 능력,  갈등 관리",
            "넘치는 에너지와 우수한 의사소통 능력을 갖췄다. 남을 돌보는 일과 민감함을 천성적으로 타고 났다. 다정하며 매우 열정적인 사람이다. 형식에 얽매이지 않으며 , 이야기를 즐긴다. 업무의 질에 매우 철저하며 완벽한 업무 수행에 대해 사회적으로 인정받는 것을 좋아한다. 다른 사람들의 견해나 의견에 지나칠 정도로 염려하기도 한다.",
            "회계사 , 교육자 , 비서실 , 커뮤니케이션 위원회 , 기획자 , 요리사"),

    // S유형
    S("팀플레이형",
            "안정적, 온순함, 순응적, 기술력, 다투지 않음, 경청, 양보",
            "현상 유지의 환경 속에서 언행이 일치된 사람이다. 절제할 줄 알고, 온화한 행동 덕분에 다른 스타일의 사람과 잘 지낸다. 참을성이 있고 신실하며 친구들을 잘 돕는다. 사소한 일을 지루해하지 않고 지침을 따라 일을 잘해나가며 일 처리가 정확하다. 변화에 적응하는 시간이 필요하며 다른 방식대로 일하자고 하면 힘들어한다. 어떤 희생을 치르더라도 대결을 피하려고 하며 감정을 내면화한다. 압력이 가해질 때 수동적으로 저항하게 된다.",
            "공무원, 관리직, 엔지니어, 도예가, 사회복지사, 물리치료사, 방사선사"),
    SD("전문적 성취자형",
            "자기 분야의 권위자, 축적된 노하우, 실제적 기술 소유, 제조업 분야의 장인, 업무 진행에 장애요소가 없음",
            "객관적이고 분석적인 사람이다. 개인적 목표에 따라서 내적으로 동기가 유발되는 업무중심의 사람이다. 차분한 안정성과  견디는 특성이 성공 요인이다. 고집은 프로젝트가 시작된 후 목적을 위해선 어떤 어려움도 헤쳐나가게 하는 힘이다. 독립적이고 질문을 많이 하는 접근 방법은 계획을 완수하는 데 도움을 준다. 결과를 가지고 자신과 남을 평가하는 실용적인 사람이다. 결과에 대한 압박으로 무뚝뚝해지고 감정을 잘 드러내지 않을 수 있다.",
            "건축업, 광고, 물리치료사, 관제사, 선박제조업, 응용 소프트웨어 개발자"),
    SDI("디자이너형",
            "그림의 사물화 능력, 대범함, 효율적 사고, 유연성, 사고능력의 초현실성, 빅 픽쳐",
            "사람들과 잘 어울리며 사람들에게 놀랄 만한 것들을 보여주려 한다. 돌발적인 상황에 잘 대처하며 형식에 짓눌리지 않는다. 자신의 전문적인 영역을 고수하지 않고 항상 새로운 아이디어를 창출한다. 특히 틀을 바꾸고 시스템을 조정하는 데에는 타고난 감각이 있다. 하지만 마음속 깊이 깔린 두려움을 극복하기 힘들다. 돌발적인 행동으로 사람들에게 버림받지는 않을까 하는 두려움이 있다.",
            "3D 프린팅 디자이너, 광고, 홍보업, 건축 디자이너, 도시 설계, 패션 디자이너"),
    SDC("수사관형",
            "한곳에서의 승부, 장지적 업무 능력, 포기하지 않음, 마침내 승리, 사소한 일에 빠지지 않음, 업무집중력",
            "참을성이 있고, 자제심이 강한 성향이다. 실마리나 사실을 탐구하기 좋아한다. 일관성 방향으로 일을 추친해 나간다. 신중하고 겸손한 사람이기에 많은 사람과 잘 어울린다. 일관성 있고 붙임성도 좋다. 자발적으로 천천히 일하지만, 현상 유지를 환영하며 한계선이 정해지는 것을 싫어한다. 예측 가능한 환경을 기대한다. 이들에게는 격려와 약간의 도전, 진실된 감사를 표현하는 자세가 필요하다.",
            "경찰공무원, 은행감독원, 국과수, 제조 물품 감독, 수출입 세관업, 감사원"),
    SI("조언자형",
            "사람 존중, 편안한 친구, 따뜻한, 친절한, 배려 넘치는, 동반자",
            "일터나 집에서 좋은 관계를 유지하기 위해 노력하는 사교적인 사람이다. 이들이 결심하면 그 마음을 바꾸기란 몹시 어렵다. 이 유형은 다른 사람을 지지하고 그들의 아이디어를 응원한다. 특히 패배자를 지지하는 경향이있다. 보통 의견이 갈릴 경우 약자 편의 선다. 그러다 본인이 생각하는 방향으로 가지 않는다면 좌절감을 느낀다. 온건하고 꼼꼼하고 의존적인 경향이 있다. 종종 다른 사람을 위해 그 입장에 서서 기꺼이 중재할 만큼, 강한 정의감과 충성심을 갖고 있다.",
            "상담사, 사회복지사, 요양보호사, 심리치료사, 웃음치료사, 코치"),
    SID("평화적 지도자형",
            "사람 존중의 리더십, 궁극적 목표 지향, 모든 사람에 참여 독려, 인간애",
            "세부과정에서 자신의 의견을 고집하지 않는다. 모든 사람의 이야기를 듣고 난 뒤에 종합하는 기술을 가지고 있다. 분쟁에서 중재적 능력이 강할 뿐 아니라 들어주고 설득하고 실행에 옮기는 훌륭한 리더십도 갖췄다. 사람에 관대하고 포용할 줄 아는 관용의 에너지를 가지고 있다. 누구든지 이들에게 걸리면 스펀지처럼 흡수된다. 견인의 마력을 가진 사람이다.",
            "정치인, 동물보호단체, 약자보호시민운동, 디자이너, 도시건축 디자이너"),
    SIC("상담자형",
            "속 깊은 인간에 대한 이해, 배려, 심리적 개입, 삶의 문제에 관한 다양한 경청과 조언, 정보 제공과 경험 나눔, 공감 능력",
            "타인의 상처에 관심을 둔다. 남이 아파하는 부분을 같이 아파할 줄 알고 아픔을 달래준다. 상대의 문제를 알면 해결해 주려 한다. 중재 능력이 강하고, 차분하며 질서에 순응한다. 원칙적이고 인간적이라 어떤 업무도 빈틈없이 잘 처리한다. 모든 일을 지혜롭게 처리하기 때문에 뒤탈이 없다. 도리어 상대로부터 그 회사에는 좋은 사람이 있다는 인식을 준다.",
            "상담사, 컨설턴트, 광고, 영화 스태프, 드라마 작가, 기차 방송 안내원"),
    SC("관리자형",
            "행정력, 전문 분야 기술, 관리, 보관, 기록, 차분함, 단순 반복 업무, 화내지 않는, 편안함, 순응적, 조직중심 사고",
            "온순하고 세부지향적인 천성을 띤다. 사람에 관심을 가지며, 업무를 아주 꼼꼼하고 완벽하게 마치는 능력이 있다. 안전을 장려하는 안정적인 환경을 원한다. 완벽주의자들과 같이 어떤 일을 결정할 때 정확한 사실이나 수치가 필요하다. 선택권이 주어지면 대규모보다는 소규모 그룹을 선택한다.",
            "공무원, 모든 관리직, 한의사, 임상병리사, 볍률 사무원, 보육교사"),
    SCD("전략가형",
            "최후의 승리자, 인내심, 계획성, 설계와 실천, 굴욕도 감당, 목표지향적, 승리의 확신, 버릴 것과 취할 것을 구분해 놓음, 업무중심",
            "스스로 지도자가 되려고 하지 않는다. 하지만 지도자의 부재 시에는 침착하면서도 책략이 뛰어난 전략가로 등장한다. 성실하여 맡은 책임을 다한다. 압박하에서도 오래 참지만 스스로 살길을 준비한다. 오랜 세월 경험한 자신만의 노하우를 바탕으로 자신의 것을 반드시 챙긴다. 언젠가는 독립적인 영역을 쟁취하기 위하여 탈출한다.",
            "정치인, 무술가, 법조인, 발명가, 물리학자, 영화 대본 작가, 영화감독"),
    SCI("평화중재자형",
            "인간애, 차분한 동정심, 갈등 해결, 자기 희생, 평화주의자, 탁월한 경청자",
            "매우 세부적인 것에 중심을 둔다. 집이나 집 밖에서 적극적으로 이끌어가며 인간과계가 안정되고 사교적이다. 한편 개인주의적 독립심도 강하다. 사람들을 좋아하고 약한 자들을 후원하는 경향이 있다. 사람들의 이견이 일치하는 팀에 속하려고 하며 가고자 하는 방향대로 가지 않으면 좌절한다. 팀의 유형으로 흡수되는 것이 필요하다.",
            "유엔기관, 평화재단, 사회복지사, 보육교사, 교사, 가정상담사, 노인요양보호사"),

    // C유형
    C("논리적 사고형",
            "독서력, 합리성, 차분함, 예의 바름, 책임감, 사색적, 말에 신중함",
            "정확하고 신중하면서 실용적이다. 세부적이고 논리적인 것을 좋아한다. 정보를 모으기 때문에 끊임없이 분석한다. 수줍음이 많으며 논리성에 기초하기에 결정을 천천히 내리며 감정은 배제한다. 자신의 감정을 예민하게 인지하기 때문에 상처를 입는다. 천천히 계획된 변화를 요구한다.",
            "교수, 법조인, 회계사, 철학사, 건축설계사, 컴퓨터공학자, 작곡가, 연구직"),
    CD("설계자형",
            "완벽주의, 신뢰성, 책임감, 성실성, 계획과 실행력, 완벽한 마무리, 정리",
            "창조적이고 문제에 민감한 특성을 보인다. 높은 지성에 단호하고 빠른 대응력까지 갖추고 있다. 문제를 해결할 수 있는 가능한 한 모든 수단을 다 이용한다. 프로젝트에 초점을 맞추는 선견지명도 있다. 눈에 보이는 결과를 얻고자 하는 욕구와 정확도를 추구하려는 욕구가 균형을 이룬다. 주변 사람들이 꺼려할 정도로 차갑고 무뚝뚝하다.",
            "행사 기획자, 검찰, 항공기 조종사, 관제사, 전자공학 기술자, 시스템소프트웨어 개발자"),
    CDI("프로듀서형",
            "탁월한 일 처리 능력과 대인관계 능력, 발상과 상호 협력으로 제작, 일 속에서도 사람에 대한 존중, 차분한 인간애, 완벽한 추진력, 책임지는 멋진 인성",
            "종합적 사고와 전체를 보는 능력이 강하다. 어떻게 해야 일을 해야 효율적인지를 안다. 사람보다는 일 쪽에 에너지가 강하다. 사람을 설득하기보다는 필요 때문에 움직이게 한다. 밑그림을 그릴 수 있고, 스스로 실행할 수도 있는 사람이다. 일에 대한 욕심이나 집착, 질투심도 강해서 반드시 목적하는 바를 끌어내고야 만다.",
            "영화감독, TV프로 PD, 상품광고 기획자, 영화평론가, 도시설계사, 교수, 대중 강사"),
    CDS("심사숙고형",
            "장기적 업무 능력, 대형 프로젝트 능력, 종합적 사고, 큰 크림, 오케스트라 지휘자형, 끈기, 인내, 성취 능력, 강인한 체력, 정신력, 불굴의 정신",
            "일의 질적인 특성과 완벽성을 위해 결단력을 제시한다. 논리적, 분석적, 세부지향적이며, 자신과 타인에 높은 기준을 둔다. 손에 들어온 업무에 대해서 상당히 집중력이 강하다. 사람과의 관계, 생각의 과정 그리고 업무 수행에서도 분석적, 선택적인 태도를 보인다. 상대방을 우대하면서 여러 그룹을 함께 이끌어나간다. 선천적인 평화주의자이다.",
            "국가 대형 사업, 고속도로 공사, 비행선 개발, 무기 개발, 원자력 부문 전문 개발자"),
    CI("평론가형",
            "분석력, 관찰력, 감성, 언어 구사 능력, 논리력, 설득력, 호소력, 차분한 정서, 인간적인 매력",
            "사람들의 톡특한 가치와 세부사항을 알아차린다. 성공적인 업무 완수에 필요한 사람에 대해서는 특별히 인식하고 식별하여 고려한 것을 결합한다. 이런 점은 공개 토론을 발전시킨다. 스스로와 경쟁하려는 경향이 있다. 어떠한 거부나 비판을 피하고자 더 나은 모습을 보이려고 본인에게 압박을 가한다. 통합된 교육 능력도 갖고 있다.",
            "예술가, 정치가, 교사, 코치, 작곡가, 화가, 시인, 드라마 작가, 연예인, 가수"),
    CID("작가형",
            "예술적 감각, 대형 프로젝트, 섬세한 실행력, 탁월한 발상의 현실화",
            "이론가여서 논리적 구성 능력이 뛰어나다. 워낙 독서량이 많아 박삭하고, 만물의 근본 원리를 알기 위해 항상 연구한다. 연구와 발표를 병행하기를 원한다. 대중에게 이론을 가르치는, 쉽고도 효율적인 강의법을 알고 있다. 자신이 연구한 것을 저술로 남기는 집필 활동에도 기꺼이 에너지를 쏟고 싶어 한다.",
            "영화음악, 대하소설 작가, 뮤지컬 작가, 대형 화가, 오케스트라 지휘자"),
    CIS("중재자형",
            "상상력, 현실화 능력, 논리력, 설득력, 인내심, 제조 능력, 섬세하며 부드러움",
            "관습과 충의로 움직이는 관계중심의 스타일이다. 다정하며 열정적이고, 격식을 차리지 않으며, 이야기 하는 것을 좋아한다. 하지만 다른 사람의 생각이나 의견에 지나치게 염려하는 특성을 보인다. 비판과 혹평에 민감하다. 분석적 능력과 의사소통 능력을 이용해 확고부동한 지위를 얻기 위해 노력한다. 친근하고 융통성 있으며 뛰어난 적응력을 가지고 있다.",
            "실용예술업, 지역축제 문화업, 문화재 보존사업, 문화재 복원사업, 로고 및 홍보물 제작업"),
    CS("원칙중심형",
            "가장 많은 직업군을 가진 인재형, 성실성, 책임감, 온화함, 관리자, 연구자",
            "언제나 정확하고 섬세하며, 견고하고 변하지 않는다. 사업할 때나 개인적인 생활에서도 규칙과 단계를 따르는 경향이 짙다. 약삭빠르며 요령 좋은 스타일은 아니다. 동료들과 의식적으로 대항하지 않으며, 발생 가능한 불화와 대립, 논쟁을 방지하기 위해서 조심한다. 사람을 좋아하지만 아주 친밀한 몇몇 사람들과 지내기를 원한다. 어떤 결정을 내리기에 앞서 정확한 사실이나 수치가 있어야 한다",
            "법조인, 노무사, 세무사, 회계사, 연구원, 판사, 변호사, 의사, 안경사, 기계공학자"),
    CSD("국난극복형",
            "자기 희생, 대의를 생각함, 협력 중시, 분명한 논리 위의 지속적 실천, 충성심과 일을 푸는 지혜",
            "흔들리지 않는다. 자신이 해야 할 분명한 원칙은 무슨 일이 있어도 고수한다. 창의적이며 부딪힌 문제를 해결하기 위하여 깊이 연구한다. 자신을 향한 비난의 소리가 사방에서 불어와도 눈 하나 꿈쩍하지 않는다. 명랑하지는 않지만, 침착하며 대형 프로젝트에 강하다. 현장중심의 실천적 지도자로 어려운 시기에 혜성처럼 등장한다.",
            "직업군인, 외교관, 회사원, 컴퓨터 보안 전문가, 공예가, 환경공학 기술자"),
    CSI("교수형",
            "명석한 분석력, 차분한 논리적 완성, 재미있게 설명, 사람 존중, 학문적 성취도, 전달 능력",
            "말이 논리적이면서도 청산유수인 따듯한 사람이다. 예민하면서 높은 기준을 갖는다. 사실과 근거 자료를 수집한 후에 결정한다. 친절하고 열정적이며, 공적이고 수다스럽다. 다른 사람의 생각에 대해서 많이 걱정하는 면도 있다. 논리와 감정을 통해서 다른 사람들을 설득하는 세심한 사람이다.",
            "학술적 연구원, 대학교수, 철학자, 물리학자, 만화가, 여행 서비스 종사자, 시민단체 활동가");


    private final String category;
    private final String pros;
    private final String ex;
    private final String job;

    public String getKey() {
        return name();
    }
}
