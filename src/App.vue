<template>
  <v-app id="inspire">
    <v-navigation-drawer
      class="purple lighten-3"
      v-model="drawer"
      dark
      app
    >
    
    <v-list-item>
            <v-list-item-avatar>
            <v-img src="pp.jpeg"></v-img>
            </v-list-item-avatar>
    </v-list-item>
    <v-list-item link>
        <v-list-item-content>
          <v-list-item-title class="text-h6">
            Nur Izzah
          </v-list-item-title>
          <v-list-item-subtitle>
            tadjizzah@gmail.com
          </v-list-item-subtitle>
        </v-list-item-content>
      </v-list-item>

      <v-divider class="black"></v-divider>

      <v-list
      dense
      nav
      >
        <v-list-item
          v-for="item in items"
          :key="item.title"
          :to="item.to"
          link
        >
          <v-list-item-icon>
            <v-icon>{{ item.icon }}</v-icon>
          </v-list-item-icon>

          <v-list-item-content>
            <v-list-item-title>{{ item.title }}</v-list-item-title>
          </v-list-item-content>
        </v-list-item>
      </v-list>

      <template v-slot:append>
        <div class="pa-2">
          <v-btn block>
            Log Out
          </v-btn>
        </div>
      </template>
    </v-navigation-drawer>

    <v-app-bar app>
      <v-app-bar-nav-icon @click="drawer = !drawer"></v-app-bar-nav-icon>

      <v-toolbar-title>Student Information System</v-toolbar-title>
    </v-app-bar>

    <v-main>
      <router-view></router-view>
    </v-main>
  </v-app>
</template>

<script>
  export default {
    data: () => ({ drawer: null, 
            items: [
          { title: 'Dashboard', icon: 'mdi-view-dashboard', to: '/' },
          { title: 'User Account', icon: 'mdi-account-box', to: '/useraccount'},
          { title: 'Timetable', icon: 'mdi-timetable', to: '/timetable'},
          { title: 'Assignment', icon: 'mdi-clipboard-text', to: '/assignment' },          
          { title: 'Course', icon: 'mdi-view-list', to: '/courselist' },
          { title: 'Coursework', icon: 'mdi-list-status', to: '/courseresult' },
        // { title: 'Financial', icon: 'mdi-bank', to: '/financial' },
          { title: 'About', icon: 'mdi-information', to: '/about' },
        ],
        //courselist: [
        //  { title: 'Semester 1', to: '/semester1'},
        //  { title: 'Semester 2', to: '/semester2'},
        //  { title: 'Semester 3', to: '/semester3'},
        //  { title: 'Semester 4', to: '/semester4'},
        //  { title: 'Semester 5', to: '/semester5'},
        //  { title: 'Semester 6', to: '/semester6'},
        //  { title: 'Semester 7', to: '/semester7'},
        //  { title: 'Semester 8', to: '/semester8'},
        //],
    }),
  }
</script>