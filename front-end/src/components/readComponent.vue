<template>
    <div class="read">
    
        <div class="content">
            <div class="title">
                글 제목 부분 입니다.
            </div>

            <div class="writingDate">
                0000.00.00
            </div>

            <div class="nickName">
                시스템 모니터
            </div>

            <div class="main">
                글 내용 부분 입니다.
            </div>
        </div>
</template>

<script>
export default {

}
</script>

<style>
* {margin : 0; padding : 0;}

.read {
    width : 50%; margin : 50px auto ; border : 1px solid #111;
}

.content {
    margin : 5px 0; padding: 0 10px; 
    color : #555; text-align: left; font-size: 20px;
    border-right: none; border-left: none;
}

.title {
    float: left;
    width : 80%; height : 35px; padding : 0 15px; 
    box-sizing : border-box;
    border-right: none; border-left: none;
}

.writingDate {
    float: left; text-align: center;
    width : 20%; height : 35px;
    box-sizing : border-box; vertical-align: bottom;
    border-right: none; border-left: none;
}

.nickName {
    float: left;
    width : 100%; height : 35px; padding : 0 15px; 
    box-sizing : border-box; border : 1px solid #111;
    border-right: none; border-left: none;
}

.main {
    width : 100%; height : 500px; padding : 0 15px; 
    box-sizing : border-box; border : 1px solid #111;
    border-right: none; border-left: none;
}
</style>