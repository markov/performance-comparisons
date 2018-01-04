package org.gradle.test.performance30_5

import org.junit.Assert.*

class Test30_405 {
    private val production = Production30_405("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}