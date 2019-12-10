
             
              $(document).ready(function(){
            	  
            	  
            	  

            	  if(disSideSlideSW == 1){						// 상황에 따른 드롭다운
            		  
            		  
            		  var submenu = $(".columnSideDistrictDrop");
            		  
            		  submenu.slideDown();
            		  
            		  
            		  
            	  }
            	  
            	  
            	  if(disSideSlideSW == 2){
            		  
            		  
            		  var submenu = $(".columnSideProvinceDrop");
            		  
            		  submenu.slideDown();
            		  
            		  
            		  
            	  }
            	  
            	  
            	  
            	  
            	  
            	  
            	  
            	  if(sideColorBold == "seoul"){						// 상황에 따른 사이드메뉴 폰트굵기
            		  
            		  $("#sideSeoul").css("font-weight", "bold");
            		  
            	  }
            	  
            	  if(sideColorBold == "gyeonggi"){						// 상황에 따른 사이드메뉴 폰트굵기
            		  
            		  $("#sideGyeonggi").css("font-weight", "bold");
            		  
            	  }
            	  
            	  
            	  
            	  
            	  
            	  
            	  
            	  
            	  
            	  
            	  
            	  
                 
                  $(".columnSideDistrictMenu").click(function(){
                      var submenu = $(this).next("div");
           
                     
                      if( submenu.is(":visible") ){
                          submenu.slideUp();
                      }else{
                          submenu.slideDown();
                      }
                      
                      
                      return false;
                  });


                  $(".columnSideProvinceMenu").click(function(){
                      var submenu = $(this).next("div");
           
                     
                      if( submenu.is(":visible") ){
                          submenu.slideUp();
                      }else{
                          submenu.slideDown();
                      }
                      
                      
                      
                      return false;
                  });


              });
       