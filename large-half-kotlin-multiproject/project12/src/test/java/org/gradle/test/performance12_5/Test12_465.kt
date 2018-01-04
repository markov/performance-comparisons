package org.gradle.test.performance12_5

import org.junit.Assert.*

class Test12_465 {
    private val production = Production12_465("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}