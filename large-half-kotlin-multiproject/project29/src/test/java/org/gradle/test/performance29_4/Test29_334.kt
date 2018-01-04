package org.gradle.test.performance29_4

import org.junit.Assert.*

class Test29_334 {
    private val production = Production29_334("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}