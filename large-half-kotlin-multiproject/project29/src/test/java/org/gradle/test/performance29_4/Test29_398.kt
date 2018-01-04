package org.gradle.test.performance29_4

import org.junit.Assert.*

class Test29_398 {
    private val production = Production29_398("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}