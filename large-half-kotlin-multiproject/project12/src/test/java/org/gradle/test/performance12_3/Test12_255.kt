package org.gradle.test.performance12_3

import org.junit.Assert.*

class Test12_255 {
    private val production = Production12_255("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}