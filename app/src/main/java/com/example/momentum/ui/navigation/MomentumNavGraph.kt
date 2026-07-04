package com.example.momentum.ui.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.momentum.ui.screens.splash.SplashScreen
import com.example.momentum.ui.screens.onboarding.OnboardingScreen
import com.example.momentum.ui.screens.auth.SignInScreen
import com.example.momentum.ui.screens.auth.SignUpScreen
import com.example.momentum.ui.screens.auth.ForgotPasswordScreen
import com.example.momentum.ui.screens.profile.ProfileSetupScreen

import com.example.momentum.ui.screens.dashboard.DashboardScreen
import com.example.momentum.ui.screens.tasks.AddTaskScreen
import com.example.momentum.ui.screens.tasks.TaskDetailsScreen
import com.example.momentum.ui.screens.checklist.DailyChecklistScreen
import com.example.momentum.ui.screens.reports.DailyReportScreen
import com.example.momentum.ui.screens.reports.WeeklyReportScreen
import com.example.momentum.ui.screens.reports.MonthlyReportScreen
import com.example.momentum.ui.screens.achievements.AchievementsScreen
import com.example.momentum.ui.screens.ai.AIInsightsScreen
import com.example.momentum.ui.screens.profile.ProfileScreen
import com.example.momentum.ui.screens.profile.SettingsScreen

@Composable
fun MomentumNavGraph(
    navController: NavHostController,
    startDestination: String = Screen.Splash.route
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = Modifier.fillMaxSize()
    ) {
        composable(Screen.Splash.route) {
            SplashScreen(navController = navController)
        }
        composable(Screen.Onboarding.route) {
            OnboardingScreen(navController = navController)
        }
        composable(Screen.SignIn.route) {
            SignInScreen(navController = navController)
        }
        composable(Screen.SignUp.route) {
            SignUpScreen(navController = navController)
        }
        composable(Screen.ForgotPassword.route) {
            ForgotPasswordScreen(navController = navController)
        }
        composable(Screen.ProfileSetup.route) {
            ProfileSetupScreen(navController = navController)
        }
        composable(Screen.Dashboard.route) {
            DashboardScreen(navController = navController)
        }
        composable(Screen.AddTask.route) {
            AddTaskScreen(navController = navController)
        }
        composable(Screen.TaskDetails.route) { backStackEntry ->
            val taskId = backStackEntry.arguments?.getString("taskId")
            TaskDetailsScreen(navController = navController, taskId = taskId)
        }
        composable(Screen.DailyChecklist.route) {
            DailyChecklistScreen(navController = navController)
        }
        composable(Screen.DailyReport.route) {
            DailyReportScreen(navController = navController)
        }
        composable(Screen.WeeklyReport.route) {
            WeeklyReportScreen(navController = navController)
        }
        composable(Screen.MonthlyReport.route) {
            MonthlyReportScreen(navController = navController)
        }
        composable(Screen.Achievements.route) {
            AchievementsScreen(navController = navController)
        }
        composable(Screen.AIInsights.route) {
            AIInsightsScreen(navController = navController)
        }
        composable(Screen.Profile.route) {
            ProfileScreen(navController = navController)
        }
        composable(Screen.Settings.route) {
            SettingsScreen(navController = navController)
        }
        // Other routes will be added here as we implement the screens
    }
}
