package org.gradle.test.performance12_1

import org.junit.Assert.*

class Test12_49 {
    private val production = Production12_49("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}