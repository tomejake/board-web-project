<template>
    <div class="read">
        <div class="read-content">
            <div class="read-title">
                {{$store.state.thisBoard.title}}
            </div>
            <div class="read-writeDate">
                {{$store.state.thisBoard.writeDate}}
            </div>
            <div class="read-userid">
                {{$store.state.thisBoard.user.userid}}
            </div>
            <div class="read-main">
                {{$store.state.thisBoard.content}}
            </div>
        </div>
    </div>
</template>

<script>
export default {
    name: 'ReadComponent',
    data() {
        return {
        }
    },
}
</script>

<style>

.read {
    width : 50%; margin : 50px auto ; border : 1px solid #111;
}

.read-content {
    color : #555; text-align: left; font-size: 20px;
    border-right: none; border-left: none;
}

.read-content div{
    padding: 5px;
}

.read-title {
    float: left;
    width : 80%; height : 40px;
    box-sizing : border-box;
    border-right: none; border-left: none;
}

.read-writeDate {
    float: left; text-align: center;
    width : 20%; height : 40px;
    box-sizing : border-box; vertical-align: bottom;
    border-right: none; border-left: solid 1px black;
}

.read-userid {
    float: left;
    width : 100%; height : 40px;
    box-sizing : border-box; border : 1px solid #111;
    border-right: none; border-left: none;
}

.read-main {
    width : 100%; height : 600px;
    box-sizing : border-box;
} 
</style>