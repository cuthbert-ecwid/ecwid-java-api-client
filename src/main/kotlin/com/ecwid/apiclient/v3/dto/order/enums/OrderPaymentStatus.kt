package com.ecwid.apiclient.v3.dto.order.enums

enum class OrderPaymentStatus {
	AWAITING_PAYMENT,
	PAID,
	CANCELLED,
	REFUNDED,
	PARTIALLY_REFUNDED,
	INCOMPLETE
}