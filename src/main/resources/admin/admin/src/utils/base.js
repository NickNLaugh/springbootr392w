const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootr392w/",
            name: "springbootr392w",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootr392w/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "医院碳排放管理平台"
        } 
    }
}
export default base
