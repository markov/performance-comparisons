package org.gradle.test.performance24_5

import org.junit.Assert.*

class Test24_468 {
    private val production = Production24_468("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}