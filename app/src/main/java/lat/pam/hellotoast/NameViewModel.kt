package lat.pam.hellotoast

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NameViewModel : ViewModel(){
    //create a liveData with a String
    val currentName : MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }
    //rest of the viewmodel..
}