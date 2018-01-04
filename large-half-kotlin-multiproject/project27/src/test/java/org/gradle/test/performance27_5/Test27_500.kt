package org.gradle.test.performance27_5

import org.junit.Assert.*

class Test27_500 {
    private val production = Production27_500("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}