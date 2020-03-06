package com.thawdezin.violet

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.Composable
import androidx.compose.Model
import androidx.ui.core.Text
import androidx.ui.core.setContent
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.SimpleImage
import androidx.ui.foundation.VerticalScroller
import androidx.ui.graphics.Color
import androidx.ui.graphics.Image
import androidx.ui.graphics.ImageConfig
import androidx.ui.graphics.colorspace.ColorSpaces
import androidx.ui.layout.Column
import androidx.ui.layout.Container
import androidx.ui.material.MaterialTheme
import androidx.ui.res.imageResource
import androidx.ui.unit.dp
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

//class ImageActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        setContent {
//            MaterialTheme {
//                Column {
//                    ItemCell(item = Item("cat 1", "https://thumbs-prod.si-cdn.com/s-rtW1rEAQTIGcmUVNFSSPC4s3I=/800x600/filters:no_upscale()/https://public-media.si-cdn.com/filer/56/4a/564a542d-5c37-4be7-8892-98201ab13180/cat-2083492_1280.jpg"))
//                    ItemCell(item = Item("cat 2", "https://images.pexels.com/photos/104827/cat-pet-animal-domestic-104827.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"))
//                }
//            }
//        }
//    }
//}
//
//data class Item(val name: String, val imageURL: String)
//
//@Model
//class ItemState {
//    var image: Image = Image(64, 64)
//}
//
//@Composable
//fun ItemCell(item: Item) {
//    val state = ItemState()
//
//    GlobalScope.launch {
//        val drawable = Coil.get(item.imageURL) {}
//        MainScope().launch {
//            state.image = RemoteImage(drawable.toBitmap())
//        }
//    }
//
//    Column {
//        Text(item.name)
//        Container(width = 180.dp, height = 180.dp) {
//            DrawImage(image = state.image)
//        }
//    }
//}
//
//// NOTE: copied from androidx.ui.graphics.AndroidImage
//class RemoteImage(private val bitmap: Bitmap) : Image {
//    override val width = bitmap.width
//    override val height = bitmap.height
//    override val config = ImageConfig.Argb8888
//    override val colorSpace = ColorSpaces.Srgb
//    override val hasAlpha = bitmap.hasAlpha()
//    override val nativeImage = bitmap
//    override fun prepareToDraw() = bitmap.prepareToDraw()
//}
//
class ImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            val img = imageResource(id = R.drawable.developer)

            Column{
                Container(width= 200.dp, height = 200.dp){
                    DrawImage(image = img)
                    //imageView.load(R.drawable.developer)
                }
                //SimpleImage(imageResource(id = R.drawable.qr), tint = Color.Green)
            }
            //DrawImage(image = img)
            //SimpleImage(image = img, tint = Color.Green)
        }
    }
}

