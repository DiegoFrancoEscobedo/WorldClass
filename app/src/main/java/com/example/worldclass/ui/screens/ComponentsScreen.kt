package com.example.worldclass.ui.screens


import androidx.compose.foundation.background

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.DirectionsWalk
import androidx.compose.material.icons.filled.Abc
import androidx.compose.material.icons.filled.AccessTimeFilled
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.AddAlarm
import androidx.compose.material.icons.filled.AddBox
import androidx.compose.material.icons.filled.AddBusiness
import androidx.compose.material.icons.filled.AddChart
import androidx.compose.material.icons.filled.AddComment
import androidx.compose.material.icons.filled.AddHome
import androidx.compose.material.icons.filled.AddToPhotos
import androidx.compose.material.icons.filled.AddToQueue
import androidx.compose.material.icons.filled.Agriculture
import androidx.compose.material.icons.filled.AlignVerticalCenter
import androidx.compose.material.icons.filled.ArrowDropDownCircle
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Crop169
import androidx.compose.material.icons.filled.Details
import androidx.compose.material.icons.filled.DeviceThermostat
import androidx.compose.material.icons.filled.DirectionsBus
import androidx.compose.material.icons.filled.DirectionsCar
import androidx.compose.material.icons.filled.DirectionsCarFilled
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.InputChip
import androidx.compose.material3.InputChipDefaults
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.MultiChoiceSegmentedButtonRow
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.SegmentedButton
import androidx.compose.material3.SegmentedButtonDefaults
import androidx.compose.material3.SingleChoiceSegmentedButtonRow
import androidx.compose.material3.Slider
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.material3.pulltorefresh.PullToRefreshBox
import androidx.compose.material3.pulltorefresh.rememberPullToRefreshState
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.material3.rememberDrawerState
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.window.core.layout.WindowHeightSizeClass
import androidx.window.core.layout.WindowWidthSizeClass
import com.example.worldclass.R
import com.example.worldclass.data.model.MenuModel
import com.example.worldclass.data.model.PostCardModel
import com.example.worldclass.ui.components.PostCardCompactComponent
import com.example.worldclass.ui.components.PostCardComponent
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.time.Duration.Companion.seconds


@Composable
fun ComponentsScreen(navController: NavHostController) {
    val menuOptions = arrayOf(
        MenuModel(1, "Buttons", "buttons", Icons.Filled.Person),
        MenuModel(2, "FloatingButtons", "floating-buttons", Icons.Filled.Add),
        MenuModel(3, "Progress", "progress", Icons.Filled.Abc),
        MenuModel(4, "Chips", "chips", Icons.Filled.Check),
        MenuModel(5, "Sliders", "sliders", Icons.Filled.DirectionsCarFilled),
        MenuModel(6, "Switches", "switches", Icons.Filled.AccessTimeFilled),
        MenuModel(7, "Badges", "badges", Icons.Filled.AddBox),
        MenuModel(8, "SnackBars", "snack-bars", Icons.Filled.AddChart),
        MenuModel(9, "AlertDialogs", "alert-dialogs", Icons.Filled.AddHome),
        MenuModel(10, "Bars", "bars", Icons.Filled.Details),
        MenuModel(11, "Adaptive", "adaptive", Icons.Filled.AddAlarm),
        MenuModel(12, "InputFields", "input-fields", Icons.Filled.DeviceThermostat),
        MenuModel(13, "DatePickers", "date-pickers", Icons.Filled.AddToQueue),
        MenuModel(14, "PullToRefresh", "pull-to-refresh", Icons.Filled.AddToPhotos),
        MenuModel(15, "BottomSheets", "bottom-sheets", Icons.Filled.AlignVerticalCenter),
        MenuModel(16, "SegmentedButtons", "segmented-buttons", Icons.Filled.ArrowDropDownCircle),


        )
    var option by rememberSaveable { mutableStateOf("buttons") }
    var drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    var scope = rememberCoroutineScope()

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet {
                Text("Menu", modifier = Modifier.padding(16.dp))
                HorizontalDivider()
                LazyColumn {
                    items(menuOptions) { item ->

                        NavigationDrawerItem(
                            icon = { Icon(item.icon, contentDescription = "") },
                            label = { Text(item.title) },
                            selected = false,
                            onClick = {
                                option = item.option
                                scope.launch {
                                    drawerState.apply {
                                        close()
                                    }
                                }
                            }
                        )
                    }
                }

            }
        }
    ) {
        Column {
            when (option) {
                "buttons" -> {
                    Buttons()
                }

                "floating-buttons" -> {
                    FloatingButtons()
                }

                "progress" -> {
                    Progress()
                }

                "chips" -> {
                    Chips()
                }

                "sliders" -> {
                    Sliders()
                }

                "switches" -> {
                    Switches()
                }

                "badges" -> {
                    Badges()
                }

                "snack-bars" -> {
                    SnackBars()
                }

                "alert-dialogs" -> {
                    AlertDialogs()
                }

                "bars" -> {
                    Bars()
                }

                "adaptive" -> {
                    Adaptive()
                }

                "input-fields" -> {
                    InputFields()
                }

                "date-pickers" -> {
                    DatePickers()
                }

                "pull-to-refresh" -> {
                    PullToRefresh()
                }

                "bottom-sheets" -> {
                    BottomSheets()
                }

                "segmented-buttons" -> {
                    SegmentedButtons()
                }

            }
        }

    }
}

//@Preview(showBackground = true)
@Composable
fun Buttons() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween

    ) {
        Button(onClick = {}) {
            Text("Filled")
        }
        FilledTonalButton(onClick = {}) {
            Text("Tonal")
        }
        OutlinedButton(onClick = {}) {
            Text("Outlined")
        }
        ElevatedButton(onClick = {}) {
            Text("Elevated")
        }
        TextButton(onClick = {}) {
            Text("Text")
        }

    }
}

//@Preview(showBackground = true)
@Composable
fun FloatingButtons() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween

    ) {
        FloatingActionButton(onClick = {}) {
            Icon(Icons.Filled.Add, "Add Button")
        }
        SmallFloatingActionButton(onClick = {}) {
            Icon(Icons.Filled.Add, "Add Button")
        }
        LargeFloatingActionButton(onClick = {}) {
            Icon(Icons.Filled.Add, "Add Button")
        }
        ExtendedFloatingActionButton(onClick = {}) {
            Icon(Icons.Filled.Add, "Add Button")
            Text("Button")
        }

    }
}

//@Preview(showBackground = true)
@Composable
fun Progress() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween

    ) {
        LinearProgressIndicator(
            modifier = Modifier
                .fillMaxWidth()
        )
        CircularProgressIndicator(
            modifier = Modifier
                .width(64.dp)

        )

    }
}

//@Preview(showBackground = true)
@Composable
fun Chips() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween

    ) {
        AssistChip(
            onClick = {},
            label = { Text("Assist Chip") },
            leadingIcon = {
                Icon(
                    Icons.Filled.AccountBox,
                    contentDescription = "Assist Chip",
                    modifier = Modifier
                        .size((AssistChipDefaults.IconSize))
                )
            }
        )
        var selected by remember { mutableStateOf(false) }
        FilterChip(
            selected = selected,
            onClick = { selected = !selected },
            label = { Text("Filter Chip") },
            leadingIcon = if (selected) {
                {
                    Icon(
                        Icons.Filled.AccountBox,
                        contentDescription = "Assist Chip",
                        modifier = Modifier
                            .size((AssistChipDefaults.IconSize))
                    )
                }
            } else {
                null
            }

        )
        InputChipExample("Dismiss", {})

    }
}

@Composable
fun InputChipExample(
    text: String,
    onDismiss: () -> Unit
) {
    var enabled by remember { mutableStateOf(true) }
    if (!enabled) return

    InputChip(
        label = { Text(text) },
        selected = enabled,
        onClick = {
            onDismiss()
            enabled = !enabled
        },
        avatar = {
            Icon(
                Icons.Filled.Person,
                contentDescription = "Icon Person",
                Modifier.size(InputChipDefaults.AvatarSize)
            )
        },
        trailingIcon = {
            Icon(
                Icons.Filled.Close,
                contentDescription = "Icon Close",
                Modifier.size(InputChipDefaults.AvatarSize)
            )
        }
    )

}

//@Preview(showBackground = true)
@Composable
fun Sliders() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly

    ) {
        var SliderPosition by remember { mutableStateOf(50f) }
        Slider(
            value = SliderPosition,
            onValueChange = { SliderPosition = it },
            steps = 10,
            valueRange = 0f..100f

        )
        Text(
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth(),
            text = SliderPosition.toString()

        )
    }
}

//@Preview(showBackground = true)
@Composable
fun Switches() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly

    ) {
        var checked by remember { mutableStateOf(true) }
        Switch(
            checked = checked,
            onCheckedChange = { checked = it }
        )
        var checked2 by remember { mutableStateOf(true) }
        Switch(
            checked = checked2,
            onCheckedChange = { checked2 = it },
            thumbContent = if (checked2) {
                {
                    Icon(
                        Icons.Filled.Check,
                        contentDescription = "Switch Check",
                        Modifier.size(InputChipDefaults.AvatarSize)
                    )
                }
            } else {
                null
            }

        )
        var checked3 by remember { mutableStateOf(true) }
        Checkbox(
            checked = checked3,
            onCheckedChange = { checked3 = it }
        )

    }
}

//@Preview(showBackground = true)
@Composable
fun Badges() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly

    ) {
        var itemCount by remember { mutableStateOf(0) }
        BadgedBox(
            badge = {
                if (itemCount > 0) {
                    Badge(
                        containerColor = Color.Red,
                        contentColor = Color.Black
                    ) {
                        Text(itemCount.toString())
                    }
                }
            }
        ) {
            Icon(
                imageVector = Icons.Filled.ShoppingCart,
                contentDescription = "Shoping cart icon"

            )

        }
        Button(
            onClick = { itemCount++ }
        ) {
            Text("Add item")

        }

    }
}


//@Preview(showBackground = true)
@Composable
fun SnackBars() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly

    ) {
        val snackState = remember { SnackbarHostState() }
        val snackScope = rememberCoroutineScope()

        SnackbarHost(hostState = snackState)

        fun launchSnackBar() {
            snackScope.launch { snackState.showSnackbar("The message has been sent") }
        }

        Button(::launchSnackBar) {
            Text("Send message")
        }

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun AlertDialogs() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly

    ) {
        var showAlertDialog by remember { mutableStateOf(false) }
        var selectedOption by remember { mutableStateOf("") }

        if (showAlertDialog) {
            AlertDialog(
                icon = { Icon(Icons.Filled.Warning, contentDescription = "Warning Icon") },
                title = { Text("Confirm Deletion") },
                text = { Text("Do you really want to delete this file?") },
                //to close the dialog when clicking any part of the screen that is not the Alert Dialog
                onDismissRequest = {},
                confirmButton = {
                    TextButton(
                        onClick = {
                            selectedOption = "Confirmed"
                            showAlertDialog = false
                        }
                    ) {
                        Text("Yes")
                    }
                },
                dismissButton = {
                    TextButton(
                        onClick = {
                            selectedOption = "Canceled"
                            showAlertDialog = false
                        }
                    ) {
                        Text("No")
                    }
                }
            )
        }
        Button(onClick = { showAlertDialog = true }) {
            Text("Delete File")
        }
        Text(selectedOption)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Bars() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        LargeTopAppBar( //Puede ser de tamaño normal (TopAppBar), medio (MediumTopAppBar) y largo
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = MaterialTheme.colorScheme.primary,
                titleContentColor = MaterialTheme.colorScheme.secondary
            ),
            title = { Text("Screen Title") },
            actions = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Filled.Search, contentDescription = "Search Button")
                }
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Filled.AddComment,
                        contentDescription = "Comment Button"
                    )
                }
            }
        )/*
        val arrayPosts = arrayOf(
            PostCardModel(1, "Title 1", "Text 1", R.drawable.si),
            PostCardModel(2, "Title 2", "Text 2", R.drawable.si),
            PostCardModel(3, "Title 3", "Text 3", R.drawable.si),
            PostCardModel(4, "Title 4", "Text 4", R.drawable.si),
            PostCardModel(5, "Title 5", "Text 5", R.drawable.si),
            PostCardModel(6, "Title 6", "Text 6", R.drawable.si),
            PostCardModel(7, "Title 7", "Text 7", R.drawable.si),
            PostCardModel(8, "Title 8", "Text 8", R.drawable.si),
            PostCardModel(9, "Title 9", "Text 9", R.drawable.si),
        )
        LazyVerticalGrid(
            columns = GridCells.Adaptive(minSize = 160.dp),
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)

        ){
            items(arrayPosts){ item ->
                PostCardComponent(item.id, item.title, item.text, item.image)
            }
        }
        */

        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxSize()

        ) {
            Adaptive()

        }
        BottomAppBar(
            containerColor = Color.Red,
            contentColor = Color.Blue
        ) {
            IconButton(
                modifier = Modifier,
                onClick = {},

                ) {
                Icon(imageVector = Icons.Filled.AccessTimeFilled, contentDescription = "")
            }
            IconButton(
                modifier = Modifier
                    .weight(1f),
                onClick = {},

                ) {
                Icon(imageVector = Icons.Filled.Abc, contentDescription = "")
            }
            IconButton(
                modifier = Modifier
                    .weight(1f),
                onClick = {},

                ) {
                Icon(imageVector = Icons.Filled.AddBusiness, contentDescription = "")
            }
            IconButton(
                modifier = Modifier
                    .weight(1f),
                onClick = {},

                ) {
                Icon(imageVector = Icons.Filled.Agriculture, contentDescription = "")
            }
            IconButton(
                modifier = Modifier
                    .weight(1f),
                onClick = {},

                ) {
                Icon(imageVector = Icons.Filled.Crop169, contentDescription = "")
            }
        }
    }
}

@Composable
fun Adaptive() {
    var windowSize = currentWindowAdaptiveInfo().windowSizeClass
    var height = currentWindowAdaptiveInfo().windowSizeClass.windowHeightSizeClass
    var width = currentWindowAdaptiveInfo().windowSizeClass.windowWidthSizeClass
    // Compact width < 600 dp Phone Portrait (Stand)
    // Medium width >= 600 dp < 840 dp Tablet Portrait (Stand)
    // Expanded width >= 840 dp Tablet Landscape (Lying down)

    // Compact height < 480 dp Phone Landscape
    // Medium height >= 480 dp < 900 dp Tablet Landscape Phone Portrait
    // Expanded height >= 900 dp Tablet Portrait

    val arrayPosts = arrayOf(
        PostCardModel(1, "Title 1", "Text 1", R.drawable.si),
        PostCardModel(2, "Title 2", "Text 2", R.drawable.si),
        PostCardModel(3, "Title 3", "Text 3", R.drawable.si),
        PostCardModel(4, "Title 4", "Text 4", R.drawable.si),
        PostCardModel(5, "Title 5", "Text 5", R.drawable.si),
        PostCardModel(6, "Title 6", "Text 6", R.drawable.si),
        PostCardModel(7, "Title 7", "Text 7", R.drawable.si),
        PostCardModel(8, "Title 8", "Text 8", R.drawable.si),
        PostCardModel(9, "Title 9", "Text 9", R.drawable.si),
    )
    if (width == WindowWidthSizeClass.COMPACT) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
        ) {
            items(arrayPosts) { item ->
                PostCardComponent(item.id, item.title, item.text, item.image)
            }
        }

    } else if (height == WindowHeightSizeClass.COMPACT) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
        ) {
            items(arrayPosts) { item ->
                PostCardCompactComponent(item.id, item.title, item.text, item.image)
            }
        }
    }
}


@Composable
fun InputFields() {
    var textFieldValue by remember { mutableStateOf("") }
    var outlinedTextFieldValue by remember { mutableStateOf("") }
    var basicTextFieldValue by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {

        TextField(
            value = textFieldValue,
            onValueChange = { textFieldValue = it },
            label = { Text("Insert text") },
            modifier = Modifier
                .padding(bottom = 19.dp)
        )

        OutlinedTextField(
            value = outlinedTextFieldValue,
            onValueChange = { outlinedTextFieldValue = it },
            label = { Text("Write here") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 19.dp),
            singleLine = true,

            )

        BasicTextField(
            value = basicTextFieldValue,
            onValueChange = { basicTextFieldValue = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .border(1.dp, Color.Gray, shape = RoundedCornerShape(8.dp))
                .background(Color.White, shape = RoundedCornerShape(8.dp))
                .padding(12.dp),
            textStyle = TextStyle(color = Color.Black, fontSize = 16.sp)
        )

    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DatePickers() {
    var showDialog by remember { mutableStateOf(false) }


//DatePicker mas sencillo (solo muestra un calendario en pantalla)
    DatePicker(
        state = rememberDatePickerState(),
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
    )

//Boton que aparece un calendario
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { showDialog = true }) {
            Text("Date Select")

        }

        if (showDialog) {
            DatePickerDialog(
                onDismissRequest = { showDialog = false },
                confirmButton = {
                    TextButton(onClick = { showDialog = false }) {
                        Text("Accept")
                    }
                }
            ) {
                DatePicker(state = rememberDatePickerState())
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PullToRefresh() {
    val refreshState = rememberPullToRefreshState()
    var isRefreshing by remember { mutableStateOf(false) }
    val items = remember { (0..40).toList() }
    val coroutineScope = rememberCoroutineScope()

    PullToRefreshBox(
        state = refreshState,
        isRefreshing = isRefreshing,
        onRefresh = {
            coroutineScope.launch {
                isRefreshing = true
                delay(5.seconds)
                isRefreshing = false
            }
        }
    ) {
        LazyColumn {
            items(items) {
                ListItem(
                    headlineContent = {
                        Text("Item $it")
                    }
                )
            }
        }
    }

}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomSheets() {
    val sheetState = rememberModalBottomSheetState(skipPartiallyExpanded = false)
    val scope = rememberCoroutineScope()

    var showModalSheet by remember { mutableStateOf(false) }

    //BottomSheetScaffold Component
    BottomSheetScaffold(
        sheetContent = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(1f)
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("This is a BottomSheetScaffold")
                Spacer(modifier = Modifier.height(16.dp))
                Button(onClick = {
                    scope.launch { sheetState.hide() }
                }) {
                    Text("Close Scaffold Sheet")
                }
            }
        },
        sheetPeekHeight = 80.dp,
        scaffoldState = rememberBottomSheetScaffoldState(sheetState)
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(onClick = {
                scope.launch { sheetState.expand() }
            }) {
                Text("Open Scaffold BottomSheet")
            }

            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = { showModalSheet = true }) {
                Text("Open Modal BottomSheet")
            }
        }

        //ModalBottomSheet Component
        if (showModalSheet) {
            ModalBottomSheet(
                onDismissRequest = { showModalSheet = false }
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.5f)
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text("This is a ModalBottomSheet")
                    Spacer(modifier = Modifier.height(16.dp))

                }
            }
        }
    }

}

@Composable
fun SegmentedButtons() {
    var selectedIndex by remember { mutableIntStateOf(0) }
    val options = listOf("Day", "Month", "Week")

    val selectedOptions = remember { mutableStateListOf(false, false, false) }
    val optionsMulti = listOf("Walk", "Ride", "Drive")


//Boton segmentado de una sola opción
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SingleChoiceSegmentedButtonRow {
            options.forEachIndexed { index, label ->
                SegmentedButton(
                    shape = SegmentedButtonDefaults.itemShape(
                        index = index,
                        count = options.size
                    ),
                    onClick = { selectedIndex = index },
                    selected = index == selectedIndex,
                    label = { Text(label) }
                )
            }
        }


        //Boton segmentado de una multiple opción
        MultiChoiceSegmentedButtonRow {
            optionsMulti.forEachIndexed { index, label ->
                SegmentedButton(
                    shape = SegmentedButtonDefaults.itemShape(
                        index = index,
                        count = options.size
                    ),
                    checked = selectedOptions[index],
                    onCheckedChange = {
                        selectedOptions[index] = !selectedOptions[index]
                    },
                    icon = { SegmentedButtonDefaults.Icon(selectedOptions[index]) },
                    label = {
                        when (label) {
                            "Walk" -> Icon(
                                imageVector =
                                Icons.AutoMirrored.Filled.DirectionsWalk,
                                contentDescription = "Directions Walk"
                            )

                            "Ride" -> Icon(
                                imageVector =
                                Icons.Default.DirectionsBus,
                                contentDescription = "Directions Bus"
                            )

                            "Drive" -> Icon(
                                imageVector =
                                Icons.Default.DirectionsCar,
                                contentDescription = "Directions Car"
                            )
                        }
                    }
                )
            }
        }
    }
}