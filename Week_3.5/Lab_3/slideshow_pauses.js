
//they want us to put everything in the "slideshow" object? How can that work given the problem???
//oh wait, nevermind, I think I got it, I had to peek at the answer though...

 slideshow = {
  photoList: ['puppy', 'kitty', 'fishy', 'birdy'],
  currentPhotoIndex: 0,
  playInterval: null,
  nextPhoto:function(){
    if (this.currentPhotoIndex <= this.photoList.length - 1){
      //not sure why im getting an undefined output but hey
      //figured it out: I put console.log around the slideshow play function at the bottom. It returns undefined.
      //me big brain
      console.log("the photo is "+this.photoList[this.currentPhotoIndex])

      this.currentPhotoIndex++;
    }
    else {
      console.log("End of slideshow")
      //pauses the slideshow
      this.pause();

      
    }
  },
  prevPhoto:function(){if (this.currentPhotoIndex <= this.photoList.lastIndexOf()){
    currentPhotoIndex++;
    console.log("the photo is "+this.photoList[this.currentPhotoIndex])

  }},

  //play
  
  play: function(){
    var self = this;
    this.playInterval = setInterval (function() {self.nextPhoto()}, 2000)
},


  //pause

  pause: function(){
    clearInterval(this.playInterval)

  },

  getCurrentPhoto: function(){
    return this.photoList[this.currentPhotoIndex]
  },
}

//not sure how to test this code but it doesn't give me errors so 🤷
//wait, I got it! 

slideshow.play()

//ayye, it works (sort of) :DD 