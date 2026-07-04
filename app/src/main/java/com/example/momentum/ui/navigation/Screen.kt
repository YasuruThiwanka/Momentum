package com.example.momentum.ui.navigation

sealed class Screen(val route: String) {
    object Splash : Screen("splash")
    object Onboarding : Screen("onboarding")
    object SignIn : Screen("sign_in")
    object SignUp : Screen("sign_up")
    object ForgotPassword : Screen("forgot_password")
    object ProfileSetup : Screen("profile_setup")
    object Dashboard : Screen("dashboard")
    object AddTask : Screen("add_task")
    object TaskDetails : Screen("task_details/{taskId}") {
        fun createRoute(taskId: String) = "task_details/$taskId"
    }
    object DailyChecklist : Screen("daily_checklist")
    object DailyReport : Screen("daily_report")
    object WeeklyReport : Screen("weekly_report")
    object MonthlyReport : Screen("monthly_report")
    object Achievements : Screen("achievements")
    object AIInsights : Screen("ai_insights")
    object Profile : Screen("profile")
    object Settings : Screen("settings")
    object Heatmap : Screen("heatmap")
}
