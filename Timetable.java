<template>
  <div class="timetable">
    <v-simple-table 
    dense
    >
    <template v-slot:default>
      <thead>
        <tr>
          <th class="text-left">
            Time/Day
          </th>
          <th class="text-left">
            Monday
          </th>
                    <th class="text-left">
            Tuesday
          </th>
          <th class="text-left">
            Wednesday
          </th>
                    <th class="text-left">
           Thursday
          </th>
          <th class="text-left">
            Friday
          </th>
        </tr>
      </thead>
      <tbody>
        <tr
          v-for="item in desserts"
          :key="item.time"
        >
          <td>{{ item.time }}</td>
          <td>{{ item.class }}</td>
          <td>{{ item.class }}</td>
          <td>{{ item.class }}</td>
          <td>{{ item.class }}</td>
          <td>{{ item.class }}</td>
        </tr>
      </tbody>
    </template>
  </v-simple-table>
  </div>
</template>
<script>
  export default {
    data () {
      return {
        desserts: [
          {
            time: '7.50 am',
            class: 159,
          },
          {
            time: '8.50 am',
            class: 159,
          },
          {
            time: '9.50 am',
            class: 159,
          },
          {
            time: '10.50 am',
            class: 159,
          },
          {
            time: '11.50 am',
            class: 159,
          },
          {
            time: '12.50 pm',
            class: 159,
          },
          {
            time: '1.50 pm',
            class: 159,
          },
          {
            time: '2.50 pm',
            class: 159,
          },
          {
            time: '3.50 pm',
            class: 159,
          },
          {
            time: '4.50 pm',
            class: 159,
          },
          {
            time: '5.50 pm',
            class: 159,
          },
 
        ],
      }
    },
  }
</script>