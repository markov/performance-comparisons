package org.gradle.test.performance29_4

import org.junit.Assert.*

class Test29_343 {
    private val production = Production29_343("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}