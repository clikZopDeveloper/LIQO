package com.example.liqo.Model


import com.google.gson.annotations.SerializedName

data class CustomerDetailBean(
    @SerializedName("data")
    val `data`: Data,
    @SerializedName("error")
    val error: Boolean, // false
    @SerializedName("msg")
    val msg: String
) {
    data class Data(
        @SerializedName("customer_interested_category")
        val customerInterestedCategory: List<CustomerInterestedCategory>,
        @SerializedName("customer_purchased_category")
        val customerPurchasedCategory: List<CustomerPurchasedCategory>,
        @SerializedName("customers")
        val customers: Customers,
        @SerializedName("lead_comments")
        val leadComments: List<LeadComment>,
        @SerializedName("lead_history")
        val leadHistory: List<LeadHistory>
    ) {
        data class CustomerInterestedCategory(
            @SerializedName("id")
            val id: Int, // 2
            @SerializedName("interested_status")
            val interestedStatus: Int, // 1
            @SerializedName("name")
            val name: String // AC - 2.5 Ton
        )

        data class CustomerPurchasedCategory(
            @SerializedName("id")
            val id: Int, // 1
            @SerializedName("name")
            val name: String, // AC - 1 Ton
            @SerializedName("purchased_status")
            val purchasedStatus: Int // 1
        )

        data class Customers(
            @SerializedName("address")
            val address: String, // address
            @SerializedName("allocated_date")
            val allocatedDate: Any, // null
            @SerializedName("city")
            val city: String, // Patiala
            @SerializedName("converted")
            val converted: Int, // 0
            @SerializedName("converted_date")
            val convertedDate: String, // 0000-00-00
            @SerializedName("created_at")
            val createdAt: String, // 2024-02-23 15:01:37
            @SerializedName("customer_type")
            val customerType: String, // visitor
            @SerializedName("doa")
            val doa: String, // 0000-00-00
            @SerializedName("dob")
            val dob: String, // 0000-00-00
            @SerializedName("email")
            val email: String, // vaibhav@gmail.com
            @SerializedName("id")
            val id: Int, // 7
            @SerializedName("is_allocated")
            val isAllocated: Int, // 0
            @SerializedName("name")
            val name: String, // vaibhav
            @SerializedName("phone")
            val phone: String, // 9675559235
            @SerializedName("remarks")
            val remarks: String, // remarks
            @SerializedName("remind_date")
            val remindDate: Any, // null
            @SerializedName("remind_time")
            val remindTime: Any, // null
            @SerializedName("source")
            val source: String, // Facebook
            @SerializedName("staff_id")
            val staffId: Int, // 2
            @SerializedName("state")
            val state: String, // Punjab
            @SerializedName("status")
            val status: Int, // 1
            @SerializedName("updated_at")
            val updatedAt: String, // 2024-02-26 13:45:27
            @SerializedName("user_id")
            val userId: Int, // 2
            @SerializedName("whatsapp")
            val whatsapp: String // 9675539898
        )

        data class LeadComment(
            @SerializedName("created_at")
            val createdAt: String, // 2024-02-23 15:01:37
            @SerializedName("id")
            val id: Int, // 8
            @SerializedName("lead_id")
            val leadId: Int, // 7
            @SerializedName("remarks")
            val remarks: String, // New Lead
            @SerializedName("remind_date")
            val remindDate: String, // 0000-00-00
            @SerializedName("remind_time")
            val remindTime: String, // 00:00:00
            @SerializedName("status")
            val status: String, // New Lead
            @SerializedName("updated_at")
            val updatedAt: Any, // null
            @SerializedName("user_id")
            val userId: Int // 2
        )

        data class LeadHistory(
            @SerializedName("interested_category")
            val interestedCategory: String,
            @SerializedName("store_name")
            val storeName: String // Panchkula
        )
    }
}