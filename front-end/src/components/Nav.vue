<template>
<body>
  <nav>
    <ul>
      <li class="menu">
      <!-- 각각의 메뉴 구성 --> 
        <div class="menu-sub">Menu1</div>
        <!-- 메인 메뉴 항목 정의 -->
          <div class="menu-content">
            <!-- 서브메뉴 (슬라이드 효과를 줄 메뉴 목록) -->
            <a href="#">Menu1-1</a>
            <a href="#">Menu1-2</a>
            <a href="#">Menu1-3</a>
            <a href="#">Menu1-4</a>
        </div>
      </li>
      <li class="menu">
      <!-- 각각의 메뉴 구성 -->
          <div class="menu-sub">Menu2</div>
          <!-- 메인 메뉴 항목 정의 -->
            <div class="menu-content">
            <!-- 서브메뉴 (슬라이드 효과를 줄 메뉴 목록) -->
            <a href="#">Menu2-1</a>
            <a href="#">Menu2-2</a>
            <a href="#">Menu2-3</a>
            <a href="#">Menu2-4</a>
        </div>
      </li>
      <li class="menu">
      <!-- 각각의 메뉴 구성 -->
        <div class="menu-sub">Menu3</div>
        <!-- 메인 메뉴 항목 정의 -->
          <div class="menu-content">
          <!-- 서브메뉴 (슬라이드 효과를 줄 메뉴 목록) -->
            <a href="#">Menu3-1</a>
            <a href="#">Menu3-2</a>
            <a href="#">Menu3-3</a>
            <a href="#">Menu3-4</a>
        </div>
      </li>
      <li class="menu">
      <!-- 각각의 메뉴 구성 -->
        <div class="menu-sub">Menu4</div>
        <!-- 메인 메뉴 항목 정의 -->
          <div class="menu-content">
          <!-- 서브메뉴 (슬라이드 효과를 줄 메뉴 목록) -->
            <a href="#">Menu4-1</a>
            <a href="#">Menu4-2</a>
            <a href="#">Menu4-3</a>
            <a href="#">Menu4-4</a>
        </div>
      </li>
    </ul>
  </nav>
</body>
</template>

<script>
export default {

}

</script>

<style>
  nav ul {
  /* 네비게이션 바 목록 구성 */
    width: 100%; /* 전체화면 크기 지정 */
    background-color: #111; /* 네비 바 전체 색상 */
    list-style-type: none; /* 목록에 블릿이 안 나오게 설정 */
    margin: 0;
    padding: 0;
  }
  
  nav ul li {
  /* 네비게이션 바 서브 메뉴 목록 */
    display: inline-block; /* 각 목록이 메뉴에서 옆으로 나란히 나오게 인라인 블록 설정 */
  }

  .menu {
  /* li태그에 적용되는 메뉴 정의 */
    position: relative;
  }

  .menu-sub {
  /* 메인 메뉴 텍스트 */
    color: #fff;
    padding: 10px;
    font-size: 12px;
    cursor: pointer; /* 마우스 포인터 위치시 손가락 모양으로 변경 설정 */
  }

  .menu-content {
  /* 서브 메뉴 항목 (슬라이드 되는 메뉴 영역) */
    position: absolute; /* .menu의 포지션이 relative이므로 menu기준 절대위치 지정하고 슬라이드 효과 유도(?) */
    background-color: #444;
    min-width: 100px; /* 슬라이드 메뉴 최소 너비 */

    display: none; /* 서브 메뉴 숨기기 (커서 위치전 까지 안보이게 설정) */
  }
  .menu-content a {
    color: #222;
    padding: 6px;
    text-decoration: none; /* 선을 안 보이게 설정 */
    display: block; /* a태그는 인라인 속성이니까 블록 속성을 가지게 한줄 배치 */
  }

  .menu:hover .menu-content {
  /* 마우스가 메뉴에 위치할때 슬라이드 효과 구현 */
    display: block; /* menu영역이 hover 될때 display: block으로 변경하여 회면에 보이게 함 */
  }

  .menu-content a:hover{
  /* 서브 메뉴 항목에 hover 효과
  (하위 항목들에 요소들에 마우스 커서가 올라가면 동작) */
    background-color: #999;
  }
</style>