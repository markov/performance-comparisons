package org.gradle.test.performance30_5

import org.junit.Assert.*

class Test30_435 {
    private val production = Production30_435("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}