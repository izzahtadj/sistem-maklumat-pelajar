<template>
  <div class="courselist">
    <v-row
      class="ma-5"
    >
      <v-col
      >
   <v-card
    class="align-center, purple lighten-3"
    max-width="344"
  >
    <v-card-title>
      Semester 1
    </v-card-title>

    <v-card-subtitle>
      2017/2018
    </v-card-subtitle>

    <v-card-actions>
      <v-btn

        text
      >
        Course List
      </v-btn>

      <v-spacer></v-spacer>

      <v-btn
        icon
        @click="show1 = !show1"
      >
        <v-icon>{{ show1 ? 'mdi-chevron-up' : 'mdi-chevron-down' }}</v-icon>
      </v-btn>
    </v-card-actions>

    <v-expand-transition>
      <div v-show="show1" class="purple lighten-4">
        <v-divider></v-divider>
                <v-list-item
          v-for="item in course1"
          :key="item.courselist1"
          :to="item.to"
          link
        >

          <v-list-item-content>
            <v-list-item-title>{{ item.courselist1 }}</v-list-item-title>
          </v-list-item-content>
        </v-list-item>
      </div>
    </v-expand-transition>
  </v-card>
      </v-col>
      <v-col>
  <v-card
    class="align-center, purple lighten-3"
    max-width="344"
  >
    <v-card-title>
      Semester 2
    </v-card-title>

    <v-card-subtitle>
      2018/2019
    </v-card-subtitle>

    <v-card-actions>
      <v-btn
        text
      >
        Course List
      </v-btn>

      <v-spacer></v-spacer>

      <v-btn
        icon
        @click="show2 = !show2"
      >
        <v-icon>{{ show2 ? 'mdi-chevron-up' : 'mdi-chevron-down' }}</v-icon>
      </v-btn>
    </v-card-actions>

    <v-expand-transition>
      <div v-show="show2" class="purple lighten-4">
        <v-divider></v-divider>
                <v-list-item
          v-for="item in course2"
          :key="item.courselist2"
          :to="item.to"
          link
        >

          <v-list-item-content>
            <v-list-item-title>{{ item.courselist2 }}</v-list-item-title>
          </v-list-item-content>
        </v-list-item>
      </div>
    </v-expand-transition>
  </v-card>
      </v-col>
      <v-col>
  <v-card
    class="align-center, purple lighten-3"
    max-width="344"
  >
    <v-card-title>
      Semester 3
    </v-card-title>

    <v-card-subtitle>
      2018/2019
    </v-card-subtitle>

    <v-card-actions>
      <v-btn

        text
      >
        Course List
      </v-btn>

      <v-spacer></v-spacer>

      <v-btn
        icon
        @click="show3 = !show3"
      >
        <v-icon>{{ show3 ? 'mdi-chevron-up' : 'mdi-chevron-down' }}</v-icon>
      </v-btn>
    </v-card-actions>

    <v-expand-transition>
      <div v-show="show3" class="purple lighten-4">
        <v-divider></v-divider>
                <v-list-item
          v-for="item in course3"
          :key="item.courselist3"
          :to="item.to"
          link
        >

          <v-list-item-content>
            <v-list-item-title>{{ item.courselist3 }}</v-list-item-title>
          </v-list-item-content>
        </v-list-item>
      </div>
    </v-expand-transition>
  </v-card>
      </v-col>
    </v-row>
  </div>
</template>
<script>
  export default {
    data: () => ({
      show1: false,
      show2: false,
      show3: false,
      course1: [
        {courselist1: 'Network'},
        {courselist1: 'Koku'},
      ],
      course2: [
        {courselist2: 'Programming'},
      ],
      course3: [
        {courselist3: 'Hacking'},
      ],
    }),
  }
</script>

