package org.gradle.test.performance29_1

import org.junit.Assert.*

class Test29_76 {
    private val production = Production29_76("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}