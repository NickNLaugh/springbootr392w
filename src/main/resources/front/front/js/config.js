
var projectName = '医院碳排放管理平台';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
        name: '我的收藏',
        url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '数据查看',
	url: './pages/yiyuantanpaifang/list.html'
}, 
{
	name: '资讯中心',
	url: './pages/ditanzhihuiyuan/list.html'
}, 

{
	name: '新闻资讯',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/springbootr392w/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["新增","查看","修改","删除","查看评论"],"menu":"医院碳排放","menuJump":"列表","tableName":"yiyuantanpaifang"}],"menu":"医院碳排放管理"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["新增","查看","修改","删除","查看评论"],"menu":"低碳智慧园","menuJump":"列表","tableName":"ditanzhihuiyuan"}],"menu":"低碳智慧园管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["新增","查看","修改","删除","报表"],"menu":"患者碳排放","menuJump":"列表","tableName":"huanzhetanpaifang"}],"menu":"患者碳排放管理"},{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["新增","查看","修改","删除","报表"],"menu":"医护人员碳排放","menuJump":"列表","tableName":"yihurenyuantanpaifang"}],"menu":"医护人员碳排放管理"},{"child":[{"appFrontIcon":"cuIcon-vipcard","buttons":["新增","查看","修改","删除","报表"],"menu":"医护车辆碳排放","menuJump":"列表","tableName":"yihucheliangtanpaifang"}],"menu":"医护车辆碳排放管理"},{"child":[{"appFrontIcon":"cuIcon-present","buttons":["新增","查看","修改","删除"],"menu":"新闻资讯","tableName":"news"},{"appFrontIcon":"cuIcon-taxi","buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-present","buttons":["查看","查看评论"],"menu":"医院碳排放列表","menuJump":"列表","tableName":"yiyuantanpaifang"}],"menu":"医院碳排放模块"},{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["查看评论","查看"],"menu":"低碳智慧园列表","menuJump":"列表","tableName":"ditanzhihuiyuan"}],"menu":"低碳智慧园模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-present","buttons":["查看","查看评论"],"menu":"医院碳排放列表","menuJump":"列表","tableName":"yiyuantanpaifang"}],"menu":"医院碳排放模块"},{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["查看评论","查看"],"menu":"低碳智慧园列表","menuJump":"列表","tableName":"ditanzhihuiyuan"}],"menu":"低碳智慧园模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
