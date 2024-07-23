package ro.curs.kotlin.ziua2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ro.curs.kotlin.ziua2.ui.theme.Ziua2Theme

@Composable
fun ArticleScreen(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
    Column(modifier = modifier) {
        Image(painter = image, contentDescription = null)
        Text(
            text = stringResource(id = R.string.article_title),
            modifier = Modifier.padding(16.dp),
            fontSize = 24.sp
        )
        Text(
            text = stringResource(id = R.string.article_first_text),
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = stringResource(id = R.string.article_second_text),
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )

    }
}

@Preview(showBackground = true)
@Composable
fun previewArticleScreen() {
    Ziua2Theme {
        ArticleScreen()
    }
}