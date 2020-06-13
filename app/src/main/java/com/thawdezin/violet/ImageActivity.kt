package com.thawdezin.violet

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.state
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.core.drawShadow
import androidx.ui.core.setContent
import androidx.ui.foundation.*
import androidx.ui.foundation.shape.corner.CircleShape
import androidx.ui.foundation.shape.corner.CutCornerShape
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.graphics.ImageAsset
import androidx.ui.graphics.Outline
import androidx.ui.graphics.Shape
import androidx.ui.layout.*
import androidx.ui.material.MaterialTheme
import androidx.ui.material.icons.Icons
import androidx.ui.material.primarySurface
import androidx.ui.res.imageResource
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp

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
//        Box(width = 180.dp, height = 180.dp) {
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
        setContent {
            Column(modifier = Modifier.fillMaxHeight().fillMaxWidth()) {
                Text("Click the image")

                Box(gravity = Alignment.BottomCenter, modifier = Modifier.fillMaxWidth())
                {
                    MyImagePlayGround()
                }

            }
        }
    }
}

@Preview(name = "Image Design Preview")
@Composable
fun MyImagePlayGround(){
    val (shape, setShape) = state<Shape> { RoundedCornerShape(topLeft = 42.dp, bottomRight = 42.dp)}
    val img = imageResource(id = R.drawable.developer)

    Column(modifier = Modifier.fillMaxSize()) {
        Box(modifier = Modifier
            .size(300.dp)
            .padding(16.dp)
            .drawShadow(9.dp , shape = shape)
            .drawBorder(size = 1.dp, color = Color.Blue, shape = shape)
            .drawBorder(size = 12.dp, color = Color.Red, shape = shape)
            .drawBorder(size = 13.dp, color = Color.Green, shape = shape)
            .drawBorder(size = 14.dp, color = Color.Yellow, shape = shape)

            .clickable{
                setShape(
                    if(shape == RoundedCornerShape(topLeft = 42.dp, bottomRight = 42.dp))
                        CutCornerShape(topLeft = 42.dp, bottomLeft = 30.dp)
                    else
                       RoundedCornerShape(topLeft = 42.dp, bottomRight = 42.dp)
                )
            }

        ) {
            //DrawImage(image = img)

            //imageView.load(R.drawable.developer)
            Image(img)
        }
        //SimpleImage(imageResource(id = R.drawable.qr), tint = Color.Green)
    }
    //DrawImage(image = img)
    //SimpleImage(image = img, tint = Color.Green)
}

