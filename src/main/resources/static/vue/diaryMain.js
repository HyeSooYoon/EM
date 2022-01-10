export default {    
    template: 
  `
  <div class="container">
 <div class="user-profile-area">
  <div class="task-manager" @click="reload">emotion manager</div> 
  <div class="side-wrapper">
   <div class="user-profile">
    <img src="../img/me.png" alt="" class="user-photo">
    <div class="user-name">윤혜수</div>
    <div class="user-mail" @click="mail">yhs1790@naver.com</div>
   </div>
   <div class="progress-status">{{now}}/365 Days</div>
   <div class="progress">
    <div class="progress-bar"></div>
   </div>
   <div class="task-status">
   <div class="task-stat">
     <div class="task-number deplight"></div>
     <div class="task-condition">우울감</div> 
    </div>
    <div class="task-stat">
     <div class="task-number dep"></div>
     <div class="task-condition">지독한우울</div> 
    </div>
    <div class="task-stat">
     <div class="task-number normal"></div>
     <div class="task-condition">낙천적</div> 
    </div>
    <div class="task-stat">
     <div class="task-number angry"></div>
     <div class="task-condition">다혈질</div> 
    </div>
   </div>
  </div>
  <div class="side-wrapper">
   <div class="project-title">Emotion</div>
   <div class="project-name">
    <div class="project-department">우울감</div>
    <div class="project-department">지독한우울</div>
    <div class="project-department">낙천적</div>
    <div class="project-department">다혈질</div>
   </div>
  </div> 
 </div>
 <div class="main-area">
  <div class="header">
   <div class="search-bar">
    <input type="text" id="value" placeholder="Search..." @keyup="searchbar">
   </div>
   <div class="inbox-calendar" @click="toggleCalendar">
    <input type="checkbox" class="inbox-calendar-checkbox">
    <div class="toggle-page">
     <span>Diary</span>
    </div>
    <div class="layer"></div>
   </div>
   <div class="color-menu">
    <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 464.7 464.7"><path d="M446.6 18.1a62 62 0 00-87.6 0L342.3 35a23 23 0 10-32.5 32.5l5.4 5.4-180.6 180.6L71.9 316c-5 5-8 11.6-8.2 18.7l-.2 3.3-2.5 56.7a9.4 9.4 0 009.4 9.8h.4l30-1.3 18.4-.8 8.3-.4a37 37 0 0024.5-10.8l240.9-240.9 4.5 4.6a23 23 0 0032.5 0c9-9 9-23.6 0-32.6l16.7-16.7a62 62 0 000-87.6zm-174 209.2l-84.6 16 138-138 34.4 34.3-87.8 87.7zM64.5 423.9C28.9 423.9 0 433 0 444.3c0 11.3 28.9 20.4 64.5 20.4s64.5-9.1 64.5-20.4C129 433 100 424 64.5 424z"/></svg>
   </div>
  </div>
  <div class="main-container">
   <div class="inbox-container">
    <div class="inbox">
    
    <div id="all" class="msg msg-department anim-y all" @click="getDiaryByEmCode">
      전체
      <svg xmlns="http://www.w3.org/2000/svg" fill="currentColor" viewBox="0 0 492 492" style="display:none;">
       <path d="M484.13 124.99l-16.11-16.23a26.72 26.72 0 00-19.04-7.86c-7.2 0-13.96 2.79-19.03 7.86L246.1 292.6 62.06 108.55c-5.07-5.06-11.82-7.85-19.03-7.85s-13.97 2.79-19.04 7.85L7.87 124.68a26.94 26.94 0 000 38.06l219.14 219.93c5.06 5.06 11.81 8.63 19.08 8.63h.09c7.2 0 13.96-3.57 19.02-8.63l218.93-219.33A27.18 27.18 0 00492 144.1c0-7.2-2.8-14.06-7.87-19.12z"></path>
      </svg>
     </div>

     <div id="deplight" class="msg msg-department anim-y deplight none" @click="getDiaryByEmCode">
     우울감
      <svg xmlns="http://www.w3.org/2000/svg" fill="currentColor" viewBox="0 0 492 492" style="display:none;">
       <path d="M484.13 124.99l-16.11-16.23a26.72 26.72 0 00-19.04-7.86c-7.2 0-13.96 2.79-19.03 7.86L246.1 292.6 62.06 108.55c-5.07-5.06-11.82-7.85-19.03-7.85s-13.97 2.79-19.04 7.85L7.87 124.68a26.94 26.94 0 000 38.06l219.14 219.93c5.06 5.06 11.81 8.63 19.08 8.63h.09c7.2 0 13.96-3.57 19.02-8.63l218.93-219.33A27.18 27.18 0 00492 144.1c0-7.2-2.8-14.06-7.87-19.12z"></path>
      </svg>
     </div>
     <div id="dep" class="msg msg-department anim-y dep none" @click="getDiaryByEmCode">
     지독한우울
     <svg xmlns="http://www.w3.org/2000/svg" fill="currentColor" viewBox="0 0 492 492" style="display:none;">
       <path d="M484.13 124.99l-16.11-16.23a26.72 26.72 0 00-19.04-7.86c-7.2 0-13.96 2.79-19.03 7.86L246.1 292.6 62.06 108.55c-5.07-5.06-11.82-7.85-19.03-7.85s-13.97 2.79-19.04 7.85L7.87 124.68a26.94 26.94 0 000 38.06l219.14 219.93c5.06 5.06 11.81 8.63 19.08 8.63h.09c7.2 0 13.96-3.57 19.02-8.63l218.93-219.33A27.18 27.18 0 00492 144.1c0-7.2-2.8-14.06-7.87-19.12z"></path>
      </svg>
     </div>
     <div id="normal" class="msg msg-department anim-y normal none" @click="getDiaryByEmCode">
     낙천적
     <svg xmlns="http://www.w3.org/2000/svg" fill="currentColor" viewBox="0 0 492 492" style="display:none;">
       <path d="M484.13 124.99l-16.11-16.23a26.72 26.72 0 00-19.04-7.86c-7.2 0-13.96 2.79-19.03 7.86L246.1 292.6 62.06 108.55c-5.07-5.06-11.82-7.85-19.03-7.85s-13.97 2.79-19.04 7.85L7.87 124.68a26.94 26.94 0 000 38.06l219.14 219.93c5.06 5.06 11.81 8.63 19.08 8.63h.09c7.2 0 13.96-3.57 19.02-8.63l218.93-219.33A27.18 27.18 0 00492 144.1c0-7.2-2.8-14.06-7.87-19.12z"></path>
      </svg>
     </div>
     <div id="angry" class="msg msg-department anim-y angry none" @click="getDiaryByEmCode">
     다혈질
     <svg xmlns="http://www.w3.org/2000/svg" fill="currentColor" viewBox="0 0 492 492" style="display:none;">
       <path d="M484.13 124.99l-16.11-16.23a26.72 26.72 0 00-19.04-7.86c-7.2 0-13.96 2.79-19.03 7.86L246.1 292.6 62.06 108.55c-5.07-5.06-11.82-7.85-19.03-7.85s-13.97 2.79-19.04 7.85L7.87 124.68a26.94 26.94 0 000 38.06l219.14 219.93c5.06 5.06 11.81 8.63 19.08 8.63h.09c7.2 0 13.96-3.57 19.02-8.63l218.93-219.33A27.18 27.18 0 00492 144.1c0-7.2-2.8-14.06-7.87-19.12z"></path>
      </svg>
     </div>
     
     <div id="loopdata"></div>        

    </div>
    <div class="add-task">
     <button class="add-button" @click="write">Add Diary</button>
    </div>
   </div>
   <div class="mail-detail">
    <div class="mail-detail-header">
     <div class="mail-detail-profile">
      <img src="../img/me.png" alt="" class="members inbox-detail" />
      <div class="mail-detail-name">윤혜수</div>
     </div> 
    </div>
    <div class="mail-contents">
     <div class="mail-contents-subject" title="우울">
      <input type="checkbox" name="msg" id="mail20" class="mail-choice EM04" checked disabled>
      <label for="mail20" @click="changeEm"></label>      
      <div class="mail-contents-title"><input type="text" name="title" style="font-size: 17px;"></input></div>
     </div>
     <div class="mail">
      <div class="mail-time">
       <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-clock">
        <circle cx="12" cy="12" r="10" />
        <path d="M12 6v6l4 2" /></svg>
        <span id="date">{{date}}</span>
      </div>
      <div class="mail-inside">
          <article>
          <section>
            <textarea spellcheck=false name="contents" style="height: 500px;"></textarea>
            <div class="textarea-clone"></div>
          </section>   
        </article>
      </div>
     </div>
    </div>
    <div class="mail-textarea">     
     <div class="textarea-icons" name="textarea-icons"> 
      <div class="send" @click="save">
       <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-send">
        <path d="M22 2L11 13M22 2l-7 20-4-9-9-4 20-7z" /></svg>
      </div>
     </div>
    </div>
   </div>
   <div class="calendar-container">
    <div class="calender-tab anim-y">


    <chart-comp></chart-comp>   

    

    </div>
   </div>
  </div>
 </div>
</div>
  `
}