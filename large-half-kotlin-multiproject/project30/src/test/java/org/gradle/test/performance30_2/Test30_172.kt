package org.gradle.test.performance30_2

import org.junit.Assert.*

class Test30_172 {
    private val production = Production30_172("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}