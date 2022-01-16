import login from '/vue/login.js'  
import diaryMain from '/vue/diaryMain.js'    

const requireAuth = () => (to, from, next) => {

    fetch('/em', {method: 'get',
    headers: {
        'Content-Type': ''
    }
    }).then(res => res.text())
    .then(data => {
        if(data !== '')
        {
            alert('접근 권한 없음.');
            next('/main');
        }
        else {
            return next();
        }

    }); 
}

const router = new VueRouter({
	mode: 'history',
	routes: [
		{ path: '/main', name: 'login', component: login,  beforeEnter : function(to, from, next) { next(); } }, 
        { path: '/em', name: 'diaryMain', component: diaryMain,  beforeEnter : function(to, from, next) { next(); } }



		
	]
	});

    export default router;