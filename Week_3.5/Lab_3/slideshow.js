
//they want us to put everything in the "slideshow" object? How can that work given the problem???

 slideshow = {
  photoList: ['puppy', 'kitty', 'fishy', 'birdy']
}

//defines the current photo index
 currentPhotoIndex = slideshow.photoList[0]

 //function that moves the current photo displayed forward
 function nextPhoto(){
   if (currentPhotoIndex < slideshow.photoList.lastIndexOf()){
     currentPhotoIndex++;
   }
   else {
     console.log("End of slideshow")
   }
 }

 //function tht moves the current photo displayed backwards
 function nextPhoto(){
   if (currentPhotoIndex <= slideshow.photoList.lastIndexOf()){
     currentPhotoIndex++;
   }
 }

//function that returns current photo
  function getCurrentPhoto(){
    return currentPhotoIndex
  }

//not sure how to test this code but it doesn't give me errors so 🤷
