<?xml version="1.0" encoding="utf-8"?>
<android.support.design.widget.CoordinatorLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="${packageName}.${activityClass}">

    <android.support.design.widget.AppBarLayout style="@style/BaseAppBarLayoutStyle">

           <android.support.v7.widget.Toolbar
               style="@style/BaseToolbarStyle"
               app:popupTheme="@style/AppTheme.PopupOverlay">

               <TextView
                   style="@style/ToolBarNavTextStyle"
                   android:text="@string/nav_call_back" />

               <TextView
                   style="@style/ToolBarTitleStyle"
                   android:text="@string/title_${activityToLayout(activityClass)}" />
           </android.support.v7.widget.Toolbar>

       </android.support.design.widget.AppBarLayout>

    <include layout="@layout/${simpleLayoutName}"/>

</android.support.design.widget.CoordinatorLayout>
