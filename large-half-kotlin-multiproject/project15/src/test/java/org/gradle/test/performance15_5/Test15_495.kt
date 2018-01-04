package org.gradle.test.performance15_5

import org.junit.Assert.*

class Test15_495 {
    private val production = Production15_495("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}