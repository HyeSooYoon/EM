import login from '/vue/login.js'  
import diaryMain from '/vue/diaryMain.js'    

const router = new VueRouter({
	mode: 'history',
	routes: [
		{ path: '/', name: 'login', component: login,  beforeEnter : function(to, from, next) { next(); } }, 
        { path: '/em', name: 'diaryMain', component: diaryMain,  beforeEnter : function(to, from, next) { next(); } }



		
	]
	});

    export default router;