package org.gradle.test.performance15_2

import org.junit.Assert.*

class Test15_172 {
    private val production = Production15_172("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}