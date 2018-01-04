package org.gradle.test.performance12_4

import org.junit.Assert.*

class Test12_362 {
    private val production = Production12_362("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}