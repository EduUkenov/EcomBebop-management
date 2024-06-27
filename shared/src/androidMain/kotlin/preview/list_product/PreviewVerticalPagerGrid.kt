package preview.list_product

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.determent.ecombebop_management.shared.home_content.list_product.a_ui_cmp.VerticalPagerGrid
import com.determent.ecombebop_management.shared.home_content.list_product.a_domain.model.ProductItem

@Preview
@Composable
fun PreviewVerticalPagerGrid() {

    val items = listOf(
        ProductItem(
            mainImage = 1,
            price = 11,
            discount = 0.10,
            priceCalculated = 0,
            title = "String",
            brand = "Brend"
        ),
        ProductItem(
            mainImage = 1,
            price = 11,
            discount = 0.10,
            priceCalculated = 0,
            title = "Платье",
            brand = "Brend"
        ),
        ProductItem(
            mainImage = 1,
            price = 11,
            discount = 0.10,
            priceCalculated = 0,
            title = "Футболка",
            brand = "Brend"
        ),
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        VerticalPagerGrid(items = items)
    }

}