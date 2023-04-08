package com.example.mathit_olympiadsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.mathit_olympiadsapp.ui.theme.LightestGray

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreenView()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun MathScreen() {
    Column(
        modifier = Modifier.fillMaxHeight(0.92f)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp, top = 20.dp),
            verticalAlignment = Alignment.Top,
        ) {
            Card(
                shape = RoundedCornerShape(10.dp),
                backgroundColor = LightestGray
            ) {
                Text(
                    text = "Search Bar will be here",
                    fontSize = 24.sp,
                    modifier = Modifier.padding(5.dp),
                )
            }
            Box(
                Modifier.fillMaxWidth(),
                contentAlignment = Alignment.CenterEnd,
            ) {
                val image: Painter = painterResource(id = R.drawable.ic_baseline_account_circle_24)
                Image(
                    painter = image, contentDescription = ""
                )
            }
        }
        var showFirstRec by remember { mutableStateOf(true) }
        Row(
            modifier = Modifier.fillMaxWidth(),
        ) {
            Text(
                text = "Олимпиады",
                textAlign = TextAlign.Left,
                modifier = Modifier.padding(start = 20.dp, top = 20.dp, bottom = 10.dp),
                fontWeight = FontWeight.SemiBold,
                color = Color.Black,
                fontSize = 36.sp,
                fontFamily = FontFamily(Font(R.font.tt_commons_medium))
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            var selectedOne by remember { mutableStateOf(true) }
            var selectedTwo by remember { mutableStateOf(false) }
            var selectedThree by remember { mutableStateOf(false) }
            val colorOne = if (selectedOne) LightestGray else Color.White
            val colorTwo = if (selectedTwo) LightestGray else Color.White
            val colorThree = if (selectedThree) LightestGray else Color.White
            val fontStyleOne =
                if (selectedOne) R.font.tt_commons_demi_bold else R.font.tt_commons_medium
            val fontStyleTwo =
                if (selectedTwo) R.font.tt_commons_demi_bold else R.font.tt_commons_medium
            val fontStyleThree =
                if (selectedThree) R.font.tt_commons_demi_bold else R.font.tt_commons_medium
            Button(
                modifier = Modifier
                    .padding(top = 5.dp, end = 3.dp, start = 3.dp, bottom = 12.dp)
                    .size(width = 110.dp, height = 36.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = colorOne,
                    contentColor = Color.Black
                ),
                border = BorderStroke(1.dp, Color.LightGray),
                shape = RoundedCornerShape(50),
                onClick = {
                    selectedOne = true
                    selectedTwo = false
                    selectedThree = false
                    showFirstRec = true
                }
            ) {
                Text(
                    text = "Уровень 1",
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(fontStyleOne))
                )
            }
            Button(
                modifier = Modifier
                    .padding(top = 5.dp, end = 3.dp, start = 3.dp, bottom = 12.dp)
                    .size(width = 110.dp, height = 36.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = colorTwo,
                    contentColor = Color.Black
                ),
                border = BorderStroke(1.dp, Color.LightGray),
                shape = RoundedCornerShape(50),
                onClick = {
                    selectedOne = false
                    selectedTwo = true
                    selectedThree = false
                    showFirstRec = false
                },
            ) {
                Text(
                    "Уровень 2",
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(fontStyleTwo))
                )
            }

            Button(
                modifier = Modifier
                    .padding(top = 5.dp, end = 3.dp, start = 3.dp, bottom = 12.dp)
                    .size(width = 110.dp, height = 36.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = colorThree,
                    contentColor = Color.Black
                ),
                border = BorderStroke(1.dp, Color.LightGray),
                shape = RoundedCornerShape(50),
                onClick = {
                    selectedOne = false
                    selectedTwo = false
                    selectedThree = true
                    showFirstRec = false
                },
            ) {
                Text(
                    "Уровень 3",
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(fontStyleThree))
                )
            }
        }
        if (showFirstRec)
            OlympsList()
    }
}

@Composable
@OptIn(ExperimentalFoundationApi::class)
fun OlympsList() {
    LazyVerticalGrid(
        cells = GridCells.Fixed(2),

        contentPadding = PaddingValues(
            start = 16.dp,
            top = 16.dp,
            end = 16.dp,
            bottom = 16.dp
        ),
        content = {
            itemsIndexed(
                listOf(
                    ItemMathFirstTier(R.drawable.hse, "Высшая проба", "idi"),
                    ItemMathFirstTier(R.drawable.phys, "Физтех", "nahui"),
                    ItemMathFirstTier(R.drawable.pvg, "Покори воробьёвы горы!", "yebishe"),
                    ItemMathFirstTier(R.drawable.spb, "Олимпиада школьников СПБГУ", "ebanoe"),
                    ItemMathFirstTier(R.drawable.lomo, "Олимпиада Ломоносов", "nenavizhy"),
                    ItemMathFirstTier(R.drawable.tournament, "Турнир городов", "tebya"),
                    ItemMathFirstTier(
                        R.drawable.mos,
                        "Московская олимпиада школьников",
                        "sin shluhi"
                    )
                )
            ) { _, item ->
                ColumnMathFirstTier(item = item)
            }
        }
    )
}

@Composable
fun PhysScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .wrapContentSize(Alignment.Center)
    ) {
        Text(
            text = "Physics",
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 20.sp
        )
    }
}

@Composable
fun ITScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Red)
            .wrapContentSize(Alignment.Center)
    ) {
        Text(
            text = "IT",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 20.sp
        )
    }
}

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController, startDestination = BottomNavItem.Math.screen_route) {
        composable(BottomNavItem.Math.screen_route) {
            MathScreen()
        }

        composable(BottomNavItem.IT.screen_route) {
            ITScreen()
        }

        composable(BottomNavItem.Physics.screen_route) {
            PhysScreen()
        }
    }
}

@Composable
fun BottomNavigation(navController: NavController) {
    val items = listOf(
        BottomNavItem.Math,
        BottomNavItem.IT,
        BottomNavItem.Physics
    )
    BottomNavigation(
        backgroundColor = colorResource(id = R.color.white),
        contentColor = Color.Black,
        modifier = Modifier
            .fillMaxHeight(0.08f)
            .clip(RoundedCornerShape(16.dp, 16.dp, 0.dp, 0.dp))
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        items.forEach { item ->
            BottomNavigationItem(
                icon = {
                    Icon(
                        painterResource(id = item.icon),
                        contentDescription = item.title,
                        modifier = Modifier.size(30.dp)
                    )
                },
                label = {
                    Text(
                        text = item.title,
                        fontSize = 12.sp,
                        fontFamily = FontFamily(Font(R.font.tt_commons_medium))
                    )
                },
                selectedContentColor = Color.Black,
                unselectedContentColor = Color.Black.copy(0.4f),
                alwaysShowLabel = true,
                selected = currentRoute == item.screen_route,
                onClick = {
                    navController.navigate(item.screen_route) {
                        navController.graph.startDestinationRoute?.let { screen_route ->
                            popUpTo(screen_route) {
                                saveState = true
                            }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}

@Composable
fun MainScreenView() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomNavigation(navController = navController) },
    ) {
        NavigationGraph(navController = navController)
    }
}