package com.thawdezin.violet.fragments
//
//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.view.ViewGroup.LayoutParams.MATCH_PARENT
//import android.widget.FrameLayout
//import android.widget.Toast
//import androidx.compose.Composable
//import androidx.compose.Model
//import androidx.fragment.app.Fragment
//import androidx.lifecycle.MutableLiveData
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.observe
//import androidx.lifecycle.viewModelScope
//import androidx.ui.core.setContent
//import androidx.ui.graphics.Color
//import androidx.ui.layout.Center
//import androidx.ui.layout.Container
//import androidx.ui.material.CircularProgressIndicator
//import androidx.ui.material.MaterialTheme
//import kotlinx.coroutines.delay
//import kotlinx.coroutines.flow.collect
//import kotlinx.coroutines.flow.flowOf
//import kotlinx.coroutines.flow.onCompletion
//import kotlinx.coroutines.flow.onStart
//import kotlinx.coroutines.launch
//
//class LoaderViewModel : ViewModel() {
//
//    val loadingLiveData = MutableLiveData<Boolean>(false)
//
//    fun fetch() {
//        viewModelScope.launch {
//            val flow = flowOf("result")
//                .onStart {
//                    loadingLiveData.value = true
//                    delay(2000)
//                }
//                .onCompletion {
//                    loadingLiveData.value = false
//                }
//                .collect {
//                    // Do something with the result
//                }
//        }
//    }
//}
//
//class LoaderFragment : Fragment() {
//
//    private val viewModel: LoaderViewModel by
//
//    @Model
//    class ActivityLoadingState(var loading: Boolean = false)
//    private val activityLoadingState = ActivityLoadingState()
//
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        return FrameLayout(context ?: return null).apply {
//            layoutParams = FrameLayout.LayoutParams(MATCH_PARENT, MATCH_PARENT)
//            setContent {
//                Loader()
//
//            }
//        }
//    }
//
//    @Composable
//    fun Loader() = MaterialTheme {
//        val loadingModel = activityLoadingState
//        Container {
//            Center {
//                if (loadingModel.loading) {
//                    CircularProgressIndicator(
//                        color = Color(0xFFFF0000)
//                    )
//                } else {
//                    Container { }
//                }
//            }
//        }
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        subscribeUI()
//        viewModel.fetch()
//    }
//
//    private fun subscribeUI() {
//        viewModel.loadingLiveData.observe(viewLifecycleOwner) {
//            activityLoadingState.loading = it
//        }
//    }
//
//}