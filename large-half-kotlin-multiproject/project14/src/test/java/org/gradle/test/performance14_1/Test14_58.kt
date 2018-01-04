package org.gradle.test.performance14_1

import org.junit.Assert.*

class Test14_58 {
    private val production = Production14_58("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}