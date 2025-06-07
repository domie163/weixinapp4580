const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootpzbe0/",
            name: "springbootpzbe0",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootpzbe0/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "使命召唤游戏助手的设计与实现"
        } 
    }
}
export default base
