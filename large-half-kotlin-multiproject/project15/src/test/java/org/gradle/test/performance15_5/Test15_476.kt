package org.gradle.test.performance15_5

import org.junit.Assert.*

class Test15_476 {
    private val production = Production15_476("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}