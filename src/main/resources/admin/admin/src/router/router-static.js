import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import discussyiyuantanpaifang from '@/views/modules/discussyiyuantanpaifang/list'
    import yihurenyuantanpaifang from '@/views/modules/yihurenyuantanpaifang/list'
    import news from '@/views/modules/news/list'
    import yonghu from '@/views/modules/yonghu/list'
    import yihucheliangtanpaifang from '@/views/modules/yihucheliangtanpaifang/list'
    import huanzhetanpaifang from '@/views/modules/huanzhetanpaifang/list'
    import discussditanzhihuiyuan from '@/views/modules/discussditanzhihuiyuan/list'
    import yiyuantanpaifang from '@/views/modules/yiyuantanpaifang/list'
    import config from '@/views/modules/config/list'
    import ditanzhihuiyuan from '@/views/modules/ditanzhihuiyuan/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/discussyiyuantanpaifang',
        name: '医院碳排放评论',
        component: discussyiyuantanpaifang
      }
      ,{
	path: '/yihurenyuantanpaifang',
        name: '医护人员碳排放',
        component: yihurenyuantanpaifang
      }
      ,{
	path: '/news',
        name: '新闻资讯',
        component: news
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/yihucheliangtanpaifang',
        name: '医护车辆碳排放',
        component: yihucheliangtanpaifang
      }
      ,{
	path: '/huanzhetanpaifang',
        name: '患者碳排放',
        component: huanzhetanpaifang
      }
      ,{
	path: '/discussditanzhihuiyuan',
        name: '低碳智慧园评论',
        component: discussditanzhihuiyuan
      }
      ,{
	path: '/yiyuantanpaifang',
        name: '医院碳排放',
        component: yiyuantanpaifang
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/ditanzhihuiyuan',
        name: '低碳智慧园',
        component: ditanzhihuiyuan
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
