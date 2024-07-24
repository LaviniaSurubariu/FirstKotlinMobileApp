package ro.curs.kotlin.ziua2


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ro.curs.kotlin.ziua2.ui.theme.Ziua2Theme

@Composable
fun TaskManagerScreen(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.ic_task_completed)
    Column(modifier = modifier, Arrangement.Center, Alignment.CenterHorizontally) {
        Image(painter = image, contentDescription = null)
        Text(
            text = stringResource(id = R.string.task_manager_title),
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(id = R.string.task_manager_subtitle),
            fontSize = 16.sp,
            )

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTaskManagerScreen() {
    Ziua2Theme {
        ArticleScreen()
    }
}