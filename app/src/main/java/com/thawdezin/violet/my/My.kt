package com.thawdezin.violet.my

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow

/**
 * Constants
 */
private const val DefaultSoftWrap: Boolean = true
private const val DefaultMaxLines = Int.MAX_VALUE
private val DefaultOverflow: TextOverflow = TextOverflow.Clip

    /**
     * fun Text(
    text: String,
    modifier: Modifier = Modifier.None,
    style: TextStyle? = null,
    softWrap: Boolean = DefaultSoftWrap,
    overflow: TextOverflow = DefaultOverflow,
    maxLines: Int = DefaultMaxLines,
    onTextLayout: (TextLayoutResult) -> Unit = {}
    ) {
    Text(
    text = AnnotatedString(text),
    modifier = modifier,
    style = style,
    softWrap = softWrap,
    overflow = overflow,
    maxLines = maxLines,
    onTextLayout = onTextLayout
    )
    }
     */
@Composable
fun MyText(
        text: String,
        modifier: Modifier = Modifier,
        style: TextStyle? = null,
        softWrap: Boolean = DefaultSoftWrap,
        overflow: TextOverflow = DefaultOverflow,
        maxLines: Int = DefaultMaxLines,
        onTextLayout: (TextLayoutResult) -> Unit = {}
) {
        style?.let {
            Text(
            text = AnnotatedString(text),
            modifier = modifier,
            style = it,
            softWrap = softWrap,
            overflow = overflow,
            maxLines = maxLines,
            onTextLayout = onTextLayout
        )
        }
}