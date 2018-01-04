package org.gradle.test.performance12_2

import org.junit.Assert.*

class Test12_147 {
    private val production = Production12_147("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}