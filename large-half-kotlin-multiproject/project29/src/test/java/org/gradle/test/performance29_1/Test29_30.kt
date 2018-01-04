package org.gradle.test.performance29_1

import org.junit.Assert.*

class Test29_30 {
    private val production = Production29_30("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}